package problemset1a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingExamples {

    public static int Act2ForEach(List<Integer> integers) {
        int sum = 0;

        for (Integer item:  integers){
            sum += item;
        }
        return sum;
    }

    public static int Act2Iterator(List<Integer> integers) {
        int sum = 0;

        // get the iterator
        Iterator<Integer> iter = integers.iterator(); //.iterator() returns iterator object
        // using iterator: easier to modify a list

        while (iter.hasNext()) {
            sum += iter.next(); // sum = sum + iter.intValue() -> autoboxing
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        System.out.println( Act2ForEach(arr));
    }
}
