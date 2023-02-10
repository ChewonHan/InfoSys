package week1;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] c = new int[3]; // declare a reference variable
        c = new int[3]; // allocate memory to store 3 integers

        // assign
        c[0] = 7;
        c[1] = 9;
        c[2] = 11;

        int[] d = {7, 9, 11}; // declare and assign

        System.out.println(Arrays.toString(c)); // hash identity
        System.out.println(Arrays.toString(d));
        System.out.println(c == d); // compare the identity
        System.out.println(Arrays.equals(c, d));
    }
}
