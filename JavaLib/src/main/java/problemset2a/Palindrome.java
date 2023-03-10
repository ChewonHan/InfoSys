package problemset2a;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba".toCharArray()));
        System.out.println(isPalindrome("abbca".toCharArray()));
    }
    public static boolean isPalindrome (char[] S) {

        String str = new String(S);

        // if the length of the word is 1, then true
        if (str.length() <= 1){
            return true;
        }
        // if the length of the word is not 1 or 2, check if are the same, then call funciton again
        else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() -1 );
            if (first == last){
                String mid = str.substring(1, str.length() - 1);
                S = mid.toCharArray();
                return isPalindrome(S);
            }
            else{
                return false;
            }
        }
    }
}


/* ATTENTION
The method isPalindrome() returns true if the input string is a palindrome, and false otherwise.
It is NOT NECESSARY to do any System.out.println() of "abba is a palindrome" etc.
*/

