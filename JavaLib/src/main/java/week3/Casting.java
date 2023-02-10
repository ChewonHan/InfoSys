package week3;

public class Casting {
    public static void main(String[] args) {
        //declared type is GeometricObject
        // actual type is Circle
        // Upcasting (subclass to superclass). Implicitly
        AbstractGeometricObject g = new Circle();

        // Downcasting (superclass to subclass). Must be explicit
        Circle c = (Circle) g;

        System.out.println("\n\n");
        System.out.println(c == g);
        System.out.println(c.getRadius());
        System.out.println(((Circle)g).getRadius()); // downcast g to circle

        System.out.println(c instanceof Circle); // true
        System.out.println(c instanceof AbstractGeometricObject); // true

        AbstractGeometricObject g2 = new AbstractGeometricObject() {
            @Override
            public double getArea(){
                return 0;
            }
        };

        System.out.println(g2 instanceof Circle); // false
        System.out.println(g2 instanceof AbstractGeometricObject); // true
    }
}
