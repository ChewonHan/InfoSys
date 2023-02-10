package week1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(1);

        forLoop(arr);
    }

    public static void forLoop( List list) {
        System.out.println("\nFor Loop");
        for (int i = 0; i < list.size(); i ++) {
            System.out.println( list.get(i));
        }
    }

    public static void forEach( List<Integer> list) { // need to define the type of the elements
        System.out.println("\nFor Each");
        for (Integer item: list) {
            System.out.println(item);
        }
    }

    public static void whileLoop(List<Integer> list) {
        System.out.println("\nWhile Loop");
        Iterator<Integer> iter = list.iterator(); // iterator
        while( iter.hasNext()){ // checks whether the iterator has any items
            System.out.println(iter.next());
        }
    }
}