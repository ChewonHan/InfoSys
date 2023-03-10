package problemset2a;


import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) { ArrayList<String> v; Permutation p = new Permutation("hat"); p.permute(); v = p.getA(); System.out.println(v); }
    private final String in;
    private ArrayList<String> a = new ArrayList<String>();
    // additional attribute if needed



    Permutation(final String str){
        in = str;
        // additional initialization if needed

    }

    public void permute() {
        permute(in, 0, in.length() - 1);
    }

    private void permute(String string, int first, int last) {
        if (first == last) {
            a.add(string);
        } else {
            for (int i = first; i <= last; i++) {
                string = swap(string, first, i);
                permute(string, first + 1, last);
                string = swap(string, first, i);
            }
        }
    }

    public static String swap(String string, int i, int j) {
        char[] charArray = string.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public ArrayList<String> getA(){
        return a;
    }
}
