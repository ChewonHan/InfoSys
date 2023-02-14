package week4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        System.out.println( myCompute(4,1));

        // Checked Exception -> the exception that compiler asks you to take care of it
        try {
            FileReader fr = new FileReader("abs.txt");
        }
        catch (FileNotFoundException e ){
            System.out.println("You got " + e);
        }

        Thread.sleep( 3000);

    }

    public static int myCompute(int i, int j) {
        // System.out.println( i / j );;
        try {
            System.out.println("Try i/j");
            int y = i / j; // unchecked Exception
            int[] x = new int[3];
            System.out.println(x[4]); // unchecked exception
            return y;
        }
        catch (ArithmeticException ex) {
            System.out.println("You got: " + ex);
            return 0;
        }
        catch (Exception ex){
            System.out.println("You got: " + ex);
            return 0;
        }
        finally {
            int x = 100;
            System.out.println("Clean Up");
        }
    }
}
