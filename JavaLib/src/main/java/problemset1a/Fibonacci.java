package problemset1a;

import java.util.ArrayList;

public class Fibonacci {

    public static String fibonacci( int n ){
        ArrayList<Integer> arr = new ArrayList<>(); // empty <> can refer to the previous one

        if (n == 1){
            arr.add(0);
        }
        /*else if (n == 2){
            arr.add(0);
            arr.add(1);
        } */
        else {
            arr.add(0);
            arr.add(1);
            for (int i = 2; i < n; i++){
                arr.add(arr.get(i-2) + arr.get(i-1));
            }
        }
        // String s = arr.toString();
        //return arr.toString(); // need to convert to string (if not then Array List)
        return arr.toString().substring(1, arr.toString().length() -1).replace(" ", ""); // return a list in terms of string
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5)); // test run
    }
}
