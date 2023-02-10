package week1;

public class StringObject {
    public static void main(String[] args) {
        String s = "Hello World"; // declare and assign

        // access 1 character
        System.out.println(s.charAt(0));

        // slicing/ substring
        System.out.println(s.substring(6, s.length() ));

        // search index
        System.out.println( s.indexOf("Wor"));
        System.out.println( s.indexOf("X")); // return -1 if not found
    }
}
