package problemset1a;

import java.util.*;

public class Pset1 {

//    /**
//     * @param args
//     */

    public static void main(String[] args) {
        System.out.println(isAllCharacterUnique("abcdefghijklmnopqrstuvABC"));
        //System.out.println(Pset1.isAllCharacterUnique("abcdefgghijklmnopqrstuvABC"));
        //System.out.println(Pset1.isPermutation("@ab", "a@b"));
        //System.out.println(Pset1.isPermutation("abcd", "bcdA"));

    }


    public static boolean isAllCharacterUnique(String sIn) {
        boolean ans = true;

        // convert sIn into an array with characters
        ArrayList<Character> charList = new ArrayList<>();
        for (int i = 0; i < sIn.length(); i++) {
            charList.add(sIn.charAt(i));
        }
        System.out.println(charList);
        System.out.println(charList.size());

        for (char j = 0; j < charList.size(); j ++ ){
            // check whether have the char[j] is in charList[j, len(charList)]
            ArrayList<Character> shortList = (ArrayList<Character>) charList.subList( j + 1 , charList.size());
            ans = !(shortList.contains(charList.get(j)));

            if (ans == false){
                break;
            }
        }
        return ans;
    }

        public static boolean isPermutation (String sIn1, String sIn2){
            //todo: add your implementation

            if (sIn1.length() == sIn2.length()){
                for (int i = 0; i < sIn1.length(); i++){

                }
            }

            return false;
        }
    }


