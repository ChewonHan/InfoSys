package week2;

public class ScopeOfVariable {
    private static int x = 0; // x is accessible anywhere inside the class -> changed to static: can't access without setter and getter

    public static void main(String[] args) {
        int a = 3; // a is only recognized in this method (main) only
        shakeHands(a);
    }

    public static void shakeHands(int n){ // n is recognized in this method only -> method variable
        for (int i = 0; i < n; i ++){ // i is only recognized inside the for loop block
            System.out.println("Shake");
        }

        // can't access to i out of for loop; a out of main method

        System.out.println(x); // x can be recognized in this whole class
    }
}
