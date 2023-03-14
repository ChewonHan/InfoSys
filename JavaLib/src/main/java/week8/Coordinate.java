package week8;

public class Coordinate {

    private double x, y;

    Coordinate(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * I can provide what the user wants
     * without giving getters and setters
     * @return
     */

    double distanceFromOrigin(){
        double distSq = x*x + y*y;
        return Math.sqrt(distSq);
    }

    Coordinate translate(double x, double y){
        return new Coordinate(this.x + x, this.y + y);
    }

    /** always override toString to give good info about your class */
    @Override
    public String toString() {
        return ("Point " + this.x + ", " + this.y);
    }

    /** without getters and setters, you are now free to adjust
     * how x and y are stored internally
     */
}
