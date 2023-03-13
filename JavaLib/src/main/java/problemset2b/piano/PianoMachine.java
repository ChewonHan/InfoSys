package problemset2b.piano;



import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

import javax.sound.midi.MidiUnavailableException;

import problemset2b.midi.Midi;
import midi.Instrument;
import music.Pitch;
import problemset2b.midi.Midi;
import problemset2b.music.NoteEvent;

public class PianoMachine {

    ArrayList<Pitch> notes = new ArrayList<>();
    ArrayList<NoteEvent> output = new ArrayList<>();

    Instrument currentInstr = Instrument.PIANO;
    int currentSft = 0;
	
	private Midi midi;
    
	/**
	 * constructor for PianoMachine.
	 * 
	 * initialize midi device and any other state that we're storing.
	 */
    public PianoMachine() {
    	try {
            midi = Midi.getInstance();
        } catch (MidiUnavailableException e1) {
            System.err.println("Could not initialize midi device");
            e1.printStackTrace();
            return;
        }
    }
    
    //TODO write method spec
    public void beginNote(Pitch rawPitch) {
    	// midi.beginNote(new Pitch(0).toMidiFrequency());
    	//TODO implement for question 1

        rawPitch = rawPitch.transpose(currentSft * 12);
        for (Pitch Playing : notes){
            if (rawPitch.equals(Playing)) return;
        }

        midi.beginNote(rawPitch.toMidiFrequency(), currentInstr);
        notes.add(rawPitch);
        output.add(new NoteEvent(rawPitch, System.currentTimeMillis(), currentInstr, NoteEvent.Kind.start));
    }
    
    //TODO write method spec
    public void endNote(Pitch rawPitch) {
    	// midi.endNote(new Pitch(0).toMidiFrequency());
    	//TODO implement for question 1

        rawPitch = rawPitch.transpose(currentSft * 12);
        Pitch toDelete = null;
        for (Pitch Playing : notes){
            if (rawPitch.equals(Playing)){
                toDelete = Playing;
            }
        }
        if (toDelete == null) return;
        midi.endNote(rawPitch.toMidiFrequency(), currentInstr);
        notes.remove(toDelete);
        output.add(new NoteEvent(rawPitch, System.currentTimeMillis(), currentInstr, NoteEvent.Kind.stop));
    }
    
    //TODO write method spec
    public void changeInstrument() {
       	//TODO: implement for question 2

        Instrument nextInstr = currentInstr.next();
        currentInstr = nextInstr;
    }
    
    //TODO write method spec
    public void shiftUp() {
    	//TODO: implement for question 3

        if (currentSft < 2){
            currentSft += 1;
        }
    }
    
    //TODO write method spec
    public void shiftDown() {
    	//TODO: implement for question 3

        if (currentSft > -2){
            currentSft += -1;
        }
    }

    boolean record = false;

    //TODO write method spec
    public boolean toggleRecording() {

    	//TODO: implement for question 4

        record = !(record);
        if (record && (output.size() != 0)){
//            for (NoteEvent notes : output){
//                output.remove(notes);
//            }
            output.clear();
        }
        return record;
    }
    
    //TODO write method spec
    public void playback() {    	
        //TODO: implement for question 4

        for ( int i = 0; i < output.size(); i ++){
            long time = i;
            if (i != output.size() -1 ){
                   time = output.get(i + 1).getTime() - output.get(i).getTime();
            }
            else{
                time = 0;
            }

            NoteEvent notes = output.get(i);

            if (notes.getKind() == NoteEvent.Kind.start){
                midi.beginNote(notes.getPitch().toMidiFrequency(), notes.getInstr());
                try{
                    Thread.sleep(time);
                } catch (InterruptedException exp) {
                    exp.printStackTrace();
                }
            }
            else if (notes.getKind() == NoteEvent.Kind.stop){
                midi.endNote(notes.getPitch().toMidiFrequency(), notes.getInstr());
                try {
                    Thread.sleep(time);
                } catch (InterruptedException exp){
                    exp.printStackTrace();
                }
            }
        }
        return;
    }
}
