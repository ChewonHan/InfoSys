package week2;

public class Circle {
    double radius; // attribute (= data field) called radius is created // not shared, only to this object
    static int numberOfCircle = 0; //shared attribute


    private String color = "White";
    public String getColor(){
        return color;
    }

    Circle() { // constructor
        System.out.println("\nNo-arg constructor is invoked");
        radius = 1.0;
        numberOfCircle++;
    }

    Circle(double newRadius) {
        System.out.println("\nConstructor with argument");
        radius = newRadius; //this. means it belongs to this item (when got diff but same name items)
        numberOfCircle++;
    }

    double getArea() { // no static <- Area belongs to this object only
        return Math.PI * Math.pow(radius, 2);
    }

    void setRadius(double newRadius) {
        if (newRadius >= 0) {
            radius = newRadius;
        }
        else {
            System.out.println("Radius is invalid");
            radius = 0;
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);

        System.out.println(c1.getArea()); // object.method()
        System.out.println(c2.getArea());
        System.out.println(Circle.numberOfCircle);
    }
}
