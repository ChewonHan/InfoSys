package MIDTERM;

import java.util.ArrayList;
import java.util.Iterator;

public class Variables {
    boolean bool = true;
    char chr = 'a';
    int itg = 1;
    long lng = 3L; // stores whole numbers from  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float flt = 0.342341f; // stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double dbl = 0.4623476871283627d; // stores fractional numbers. Sufficient for storing 15 decimal digits


    byte bt; // stores whole numbers from -128 to 127
    short srt; // stores whole numbers from -32,768 to 32,767

    int[] c; // initiate array called 'c'

    /**
     * Array vs. ArrayList / LinkedList:
     * Array is fixed size but the others are not (= unlimited)
     *
     * **/

    String d = "hellO"; // initiate a string 'd' with "hellO"

    // Alternative way to create String:
    // character array to a String
    char[] dArray = {'h', 'e', 'l', 'l', 'O'};
    String dString = new String(dArray);

    /*
    Iterator has:
    next(), hasNext(), and remove()

    ArrayList<String> sentence = new ArrayList<>();
    for(Iterator<String> i = sentence.iterator(); i.hasNext()){
        System.out.println(i.next() + " ");
    }
    */

}
