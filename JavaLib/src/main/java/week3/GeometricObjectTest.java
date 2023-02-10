package week3;

import java.util.ArrayList;

public class GeometricObjectTest {
    public static void main(String[] args) {

        Circle c = new Circle(6,"Red");
        Rectangle r = new Rectangle();
        GeometricObject g = new GeometricObject();

        System.out.println(); // just for separate
        System.out.println(c.getColor());
        System.out.println(r.getColor());

        System.out.println();
        System.out.println(c);
        System.out.println(r);
        System.out.println(g);

        System.out.println();
        System.out.println(Circle.getNumberOfObjects());
        System.out.println(Rectangle.getNumberOfObjects());
        System.out.println(GeometricObject.getNumberOfObjects());


        CustomCircle cc = new CustomCircle();
        // it triggers the no-arg constructor of CustomCircle

        System.out.println();
        System.out.println(r.overlaps(r));
        System.out.println(r.overlaps(c));

        // Dynamic binding (polymorphism)
        ArrayList<AbstractGeometricObject> arr = new ArrayList<>();

        arr.add(c);
        arr.add(r);


        System.out.println("\n");
        for (AbstractGeometricObject tmp : arr) {
            System.out.println(tmp.toString()); // .toString() is dynamically bound to different class

            if (tmp instanceof Circle) { // instanceof -> check whether the thing is in the class
                System.out.println("The radius is " + ((Circle) tmp).getRadius());
            }
        }
    }

}
