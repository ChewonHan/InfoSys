package problemset1a;

import java.util.ArrayList;
import java.util.HashSet;

public class Pset1_1 {

    public static void main(String[] args) {
        System.out.println(isAllCharacterUnique("abcdefghijklmnopqrstuvABC"));
        System.out.println(isAllCharacterUnique("abcdefgghijklmnopqrstuvABC"));
        System.out.println(isPermutation("@ab", "a@b"));
        System.out.println(isPermutation("abcd", "bcdA"));
    }
    public static boolean isAllCharacterUnique(String sIn) {
        //todo: add your implementation

        HashSet<Character> set = new HashSet<>();
        for (Character ch : sIn.toCharArray()){
            set.add(ch);
        }

        if (set.size() == sIn.length()){
            return true;
        }
        else {
            return false;
        }
    }




    public static boolean isPermutation(String sIn1, String sIn2) {
        //todo: add your implementation
        ArrayList<Character> arr = new ArrayList<>();

        for (Character ch: sIn2.toCharArray()){
            arr.add(ch);
        }

        for (Character ch : sIn1.toCharArray()){
            if (!arr.contains(ch)) {
                return false;
            }
        }
        return true;
    }
}

