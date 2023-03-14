package MIDTERM;

import MIDTERM.Objects;

public class Compare extends Objects implements Comparable<Objects> {
    private double size = 2;

    Compare(){}

    Compare(double radius){
        this.size = radius;
    }

    // Comparable interface example
    @Override
    public int compareTo(Objects obj) {
        if (this.size > obj.size){
            return 1;
        }
        else {
            return 0;
        }
    }

    /**
     * Comparable: compareTo (Other class 0): compare to another object: natural ordering
     * Comparator: compare (Class c1, Class c2): compare objects from diff. classes: custom ordering
     *
     * Abstract Class: any var, constructors (abstract class), any methods
     * Interface: public static final var, no constructors, public abstract methods
     *
     */
}
