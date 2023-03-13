package MIDTERM.privatePrac;

public class class2 {

    public static void main(String[] args) {
        class2 c2 = new class2( 2.0, "hello");
    }

    public double dbl1 = 2.0;
    private String str = "hi";

    class2(){}

    class2( double dbl1, String str){
        this.dbl1 = dbl1;
        this.str = str;

        System.out.println(dbl1);
        System.out.println(str);

        class1 c1 = new class1();

        // System.out.println(c1.var1); -> var1 is a private -> need to use getter
        System.out.println(c1.var2);
        System.out.println(c1.getVar1());
    }

}
