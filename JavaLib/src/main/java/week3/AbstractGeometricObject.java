package week3;

abstract public class AbstractGeometricObject {
    private String color = "White";
    private static int numberOfObjects = 0;

    abstract public double getArea(); // abstract method. Must be implemented by subclass
    // no {} / body defined

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
        AbstractGeometricObject.numberOfObjects = numberOfObjects;
    }

    AbstractGeometricObject(){ // no-arg constructor
        System.out.println("\nGeometric Object no-arg Constructor");
        setNumberOfObjects( getNumberOfObjects() + 1);
    }

    AbstractGeometricObject(String color){
        this.color = color;
        System.out.println("\nGeometric Object with arg Constructor");
        setNumberOfObjects( getNumberOfObjects() + 1);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return "This is a geometric object";
    }

}
