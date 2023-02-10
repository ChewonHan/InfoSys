package week3;

public class CustomCircle extends Circle{

    CustomCircle() {
        super(); // parent: Circle -> parent of Circle: GeometricObject => invoke GeometricObject and Circle with CustomCircle
        // Run from the highest hierarchy, which is Object -> GeometricObject -> Circle -> CustomCircle
        System.out.println("Custom Circle no-arg constructor");
    }


}
