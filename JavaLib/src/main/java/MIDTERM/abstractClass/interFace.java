package MIDTERM.abstractClass;

public interface interFace {
    // interface contains only constants and abstract methods
    // to specify common behavior / characteristics

    public abstract String howToEat();
}

class Animal{

    private String name = "cat";
    public Integer age = 3;

    Animal(){} // no-arg constructor

    Animal(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Chicken extends Animal implements interFace{
    public String howToEat(){
        return "chicken: fry it";
    }

    Chicken(){
        Animal ani = new Animal();
        System.out.println(ani.getName());
    }

    Chicken(String name, int age){
        Animal ani = new Animal();
        ani.setName(name);
        ani.age = age;
        System.out.println(ani.getName());
    }
}

class Chocolate implements interFace{
    public String howToEat(){
        return "chocolate: eat everyday";
    }
}
