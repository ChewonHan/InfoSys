package week1;

public class ForLoop {
    public static void main(String[] args) {
        // for (initialization; stopping condition; update)
        // stopping condition is checked before the code block is executed
        // update is executed after the code block
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        int a = 0;
        int b = 0;

        // difference between ++i and i++?
        System.out.println( ++a + " " + a); // pre-increment
        System.out.println( b++ + " " + b); // post-increment
    }
}
