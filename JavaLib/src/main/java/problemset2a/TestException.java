package problemset2a;


public class TestException {
    //YOU DO NOT NEED TO MODIFY THIS METHOD
    public static void main(String[] args) {
        String[] in = {"hello", "good night", "good morning"};

        String ret = tstException(2, in);

        System.out.println(ret);

        ret = tstException(-1, in);

        System.out.println(ret);
    }

    //IMPLEMENT YOUR SOLUTION IN THIS METHOD
    public static String tstException(int idx, String[] y) {
        // implement using try-catch
        String print = "";
        try{
            print = y[idx];
        }
        catch(Exception exception){
            print = "Out of Bounds";
        }
        return print;
    }
}
