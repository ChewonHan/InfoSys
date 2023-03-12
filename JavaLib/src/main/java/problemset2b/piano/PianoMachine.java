package piano;



import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

import javax.sound.midi.MidiUnavailableException;

import midi.Midi;
import midi.Instrument;
import music.Pitch;
import music.NoteEvent;

public class PianoMachine {

    ArrayList<Pitch> notes = new ArrayList<>();
    ArrayList<NoteEvent> output = new ArrayList<>();

    Instrument currentInstr = Midi.DEFAULT_INSTRUMENT;
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
    }
    
    //TODO write method spec
    public void shiftUp() {
    	//TODO: implement for question 3
    }
    
    //TODO write method spec
    public void shiftDown() {
    	//TODO: implement for question 3
    }
    
    //TODO write method spec
    public boolean toggleRecording() {
    	return false;
    	//TODO: implement for question 4
    }
    
    //TODO write method spec
    public void playback() {    	
        //TODO: implement for question 4
    }

}
