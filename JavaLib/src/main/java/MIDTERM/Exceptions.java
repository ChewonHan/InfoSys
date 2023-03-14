package MIDTERM;

public class Exceptions {

    public static void main(String[] args) {
        System.out.println(myCompute(2,0));
        System.out.println(myCompute(3,3));
    }

    // Try-Catch Block
    public static String myCompute(int i, int k){
        try{ //executed in the normal circumstance
            int y = i / k;
            return ("result is " + y);
        }
        catch(ArithmeticException ex){ // executed during the exception
            return "error happened";
        }
        finally { // after catch
            System.out.println("error is caught!");
        }
    }

    /**
     * Object   Throwable    Exception  ClassNotFoundException
     *                                  IOException
     *                                  RunTime Exception   ArithmeticException
     *                                                      NullPointerException
     *                                                      IndexOutofBoundsException
     *                                                      IllegalArgumentException
     *
     *                       Error      LinkageError
     *                                  VirtualMachineError
     */
}
