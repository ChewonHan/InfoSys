package MIDTERM.OODesignPattern.VIsitorEx;

import java.util.ArrayList;

public class Postage {

    /**
     * Visitor:
     * Allows for one or more operation to be applied to a set of objects at runtime,
     * decoupling the operations from the object structure
     * Useful if u need to perform operations across a diverse set of objects
     */

    public static Boolean calPostage (ArrayList<Object> items){ // Non-Visitor Design
        boolean total = false;

        for (Object o : items){
            if (o instanceof Book){
                total = true;
            }
            else if (o instanceof CD){
                total =  true;
            }
            else{
                total = false;
            }
        }
        return total;
    }
}
