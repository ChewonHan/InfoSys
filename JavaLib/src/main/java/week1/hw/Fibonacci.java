package week1.hw;

public class Fibonacci{
    public static String fibonacci(int n){
        // set up the variables
        int first = 0;
        int second = 1;
        int next = 0;

        // for loop for adding
        for (int i = 1; i <= n; ++ i) {
            next = first + second ;
            first = second;
            second = next;
        }

        String result = Integer.toString(next);
        System.out.println(result);
        return result;
    }
}