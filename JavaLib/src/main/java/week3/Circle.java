package week3;

public class Circle extends AbstractGeometricObject{ // won't inherit the private methods & variables from GeometricObject

    private double radius = 0.0; // add new attribute
    private static int numberOfObjects = 0; // it won't be the same attribute as the one in the parent class -> new static attribute. doesn't override

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // two constructors from W2
    Circle() { // constructor
        // super(); // (Optional) by default, super() is implicitly invoked first -> run parent class first
        this(5); // call below Circle function but not super() in the Circle function below
        System.out.println("No-arg constructor is invoked");
        radius = 1.0;
        numberOfObjects += 1;
    }

    Circle(double newRadius) {
        super();
        System.out.println("Constructor with argument");
        radius = newRadius;
    }

    Circle(double newRadius, String color) {
        super(color); // invoke parent class constructor with argument. must be explicit
        System.out.println("Constructor with argument");
        radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override // (Optional) decorator -> to make sure I did the thing (written as a decorator) for the parent class
    public String toString(){
        return ("This is a circle with radius " + radius);
    }
}
