package week1;

// package keyword means that the class belongs to week1 package
// public keyword indicates that this class is accessible anywhere
// class is to define a class
// static means that the attribute/method belongs to class
// void means that your method returns none
// String[] is type of expected input argument
// args is variable name
// semicolon ; is to terminate a statement
// ' ' is a single character
// " " is a line (more than a single character)

import java.math.BigDecimal;

public class Variable {
    public static void main(String[] args) {
        // int
        System.out.println("\n===integer===");
        int a; // declare variable a of integer type
        a = 0; // assign
        int b = 2; // declare and assign in one statement

        System.out.println(a + b); // math operation
        System.out.println(a + " " + b); // string concatenation
        System.out.println(a + ' ' + b); // math operation, but ' ' is converted to its ASCII code (a single space is 32)

        // boolean
        System.out.println("\n===Boolean===");
        boolean i = true;
        boolean j = false;
        System.out.println( i && j ); // and operator
        System.out.println( i || j ); // or operator
        System.out.println( a == b ); // equal

        // double
        System.out.println("\n===Double===");
        double x = 0.4;
        double y = 0.3;
        double z = x - y;
        System.out.println( z == 0.1 );
        System.out.println( z ); // floating-point error
        System.out.println( Math.abs(z - 0.1) < 0.000000001 );

        // big decimal
        System.out.println("\n===Big Decimal===");
        BigDecimal xx = new BigDecimal("0.3"); // object, not primitive data type
        BigDecimal yy = new BigDecimal("0.2");
        BigDecimal zz = xx.subtract(yy);
        System.out.println(zz);
        System.out.println(zz.equals(new BigDecimal("0.1")));
    }

}
