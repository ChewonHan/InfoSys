package MIDTERM.recursion;

public class factorial {

    public static void main(String[] args) {
        factorial fact = new factorial();
        System.out.println(fact.factorialCalc(3));
    }

    private int fac;

    factorial(){}

    factorial(int fac){
        this.fac = fac;
    }
    public int factorialCalc(int fac){
        if (fac <= 1){
            return 1;
        }
        else{
            return fac*factorialCalc(fac-1);
        }
    }
}
