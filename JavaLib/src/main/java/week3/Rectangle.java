package week3;

public class Rectangle extends AbstractGeometricObject{ // can't inherit multiple classes at once

    private double height = 0.0;
    private double width = 0.0;

    @Override
    public double getArea(){
        return getWidth() * getHeight();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private static int numberOfObjects = 0; // private attr. belongs to rectangle only

    Rectangle() { numberOfObjects += 1;}

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /* Advantages of inheritance:
     to avoid redundancy
     easy to maintain
     easy to comprehend*/

    // Method overloading: same method name, different parameters
    public String overlaps(Rectangle r){
        return "Overlaps with Rectangle object";
    }

    public String overlaps(Circle r){ // method overloading
        return "Overlaps with Circle object";
    }

}
