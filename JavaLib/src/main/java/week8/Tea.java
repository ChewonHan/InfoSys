package week8;

public class Tea {

    private boolean sugar;
    private boolean milk;

    /**
     * constructor could be private :
     * force users to use your static factory methods
     */

    private Tea (boolean sugar, boolean milk){
        this.sugar = sugar;
        this.milk = milk;
    }

    /**Limiting the situations in which your object
     * can be instantiated
     */
    // TODO Write teh static factory methods
    public static Tea giveMeTehO(){
        return new Tea(true, false);
    }

    public static Tea giveMeTehKoSong(){
        return new Tea (false, true);
    }

    // TODO Write toString()
    @Override
    public String toString() {
        if (sugar == true && milk == false){
            return "You are drinking TehO";
        }
        else{
            return "You are drinking something else";
        }
    }
}
