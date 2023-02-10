package week1;

import java.util.ArrayList;

public class listObject {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        // add/ insert
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add( 0, "Java");

        System.out.println(arr);

        // access
        System.out.println( arr.get(0));

        // set
        arr.set(0, "Python");
        System.out.println(arr);

        // search
        System.out.println(arr.indexOf("A"));

        // remove
        arr.remove( "Python");
        System.out.println(arr);
        arr.remove( 2);
        System.out.println(arr);
    }
}
