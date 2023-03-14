package week8;

public class Parrot {

    String name, type;
    ParrotSound parrotSound;

    Parrot( String name, String type){
        this.name = name;
        this.type = type;
    }

    void setSound(ParrotSound parrotSound){
        this.parrotSound = parrotSound;
    }

    void makeSound(){
        parrotSound.sound();
    }
}

interface ParrotSound{
    void sound();
}

class Squawk implements ParrotSound{

    public void sound(){
        System.out.println("squawk!");
    }
}
