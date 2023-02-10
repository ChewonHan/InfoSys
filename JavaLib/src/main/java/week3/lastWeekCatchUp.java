package week3;

public class lastWeekCatchUp {

    /*
    // Question 1
    // The Output is 1 -> False

    public static void main(String[] args) {
        System.out.println( getOne());
    }

    private static void getOne(){
        int x = 1;
        return x;
    } */

    /*
    // Question 2
    // The below will print "01234ABC" -> no {} -> consider only first line
    public static void main(String[] args) {
        for (int i = 0; i < 5; i ++)
            System.out.println(i);
            System.out.println("ABC");

    }*/

    /*
    // Question 3
    // what's the problem with the code below:
    // data field is not private -> encapsulation is missing: no point having getter and setter
    public class Democlass {
        public int x = 0;

        public int getX(){
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    } */


    /*
    // Question 4
    // What will this code print -> Yes No
    public class DemoClass {
        public void main(String[] args) {
            DemoClass dc = new DemoClass();
        }

        DemoClass(){
            this(5);
            System.out.println("No");
        }

        DemoClass(int x){
            System.out.println("Yes");
        }
    }*/


    /*
    // Question 5
    // What will it print -> 0 1
    public class DemoClass {
        private int objAttr = 0; // Object Attribute -> no static: belong to the object
        public static int classAttr = 0; // Class Attribute

        public static void main(String[] args) {
            DemoClass dc1 = new DemoClass();
            DemoClass dc2 = new DemoClass();

            dc1.objAttr += 1;
            dc1.classAttr += 1; // shld be DemoClass.classAttr

            System.out.println(dc2.objAttr);
            System.out.println(dc2.classAttr);
        }
    }*/

    }

