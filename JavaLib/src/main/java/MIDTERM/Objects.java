package MIDTERM;

public class Objects {

    public static void main(String[] args) {

        /**
         * Static Var: shared by all the instances of the class
         * not tied to any object -> fixed in the class
         *
         * Public: visible to any class in any package
         * Default: visible to only classes in the same packages
         * Private: visible only by the declaring class
         *  -> to protect data, make class easy to maintain
         * **/

        // Not assigning object to the var -> refer the values to the var
        Objects obj1 = new Objects();
        Objects obj2 = new Objects(3);

        obj1.size = 4.5;
        System.out.println(obj2.getSize());
    }

    // Data Field
    double size = 2.0;

    // no-arg Constructor: default Constructor
    Objects(){}

    // Constructor
    Objects (double newSize){
        size = newSize;
    }

    // Method
    double getSize(){
        return size;
    }
}
