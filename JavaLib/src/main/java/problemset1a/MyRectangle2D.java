package problemset1a;

// Please work on MyRectangle2D_2

public class MyRectangle2D {

    public static void main(String[] args) {
        MyRectangle2D rec1 = new MyRectangle2D();
        System.out.println(rec1.getArea());
        rec1.setWidth(3);
        rec1.setHeight(6);
        System.out.println(rec1.toString());
        MyRectangle2D rec2 = new MyRectangle2D(2,3,6,2);
        System.out.println(rec1.contains(1,1));
        System.out.println(rec1.getPerimeter());
        System.out.println("rec1" + rec1.toString());
        System.out.println("rec2" + rec2.toString());

    }

    // What does specify the center of the rectangle with get and set methods? -> need to create a constructor or attributes?
    // Prob I have now: once I create a new object (rec2) the width and height for rec1 also are changed (set): (Width, Height) should be remained (3,6) but becomes (6,2)
    static double x;
    static double y;
    static double width;
    static double height;

    MyRectangle2D(){
        this(0.0,0.0,1.0,1.0);
    }

    MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public static double getX() {
        return x;
    }

    public static void setX(double x) {
        MyRectangle2D.x = x;
    }

    public static double getY() {
        return y;
    }

    public static void setY(double y) {
        MyRectangle2D.y = y;
    }

    public static double getWidth() {
        return width;
    }

    public static void setWidth(double width) {
        MyRectangle2D.width = width;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        MyRectangle2D.height = height;
    }

    public double getArea(){
        // Should it be getHeight()*getWidth() ?
        return (height*width);
    }

    public double getPerimeter(){
        return ((height+width)*2);
    }

    public static boolean contains(double x, double y){
        double halfHeight = getHeight() / 2.0;
        double halfWidth = getWidth() / 2.0;

        if ((y <= (getY() + halfHeight)) &&
                (y >= (getY() - halfHeight)) &&
                (x <= (getX() + halfWidth)) &&
                (x >= (getX() - halfWidth))){
            return true;
        }
        else{
            return false;
        }
    }

    // my() is the original rectangle coordinate
    // () is this. rectangle
    public boolean contains(MyRectangle2D r ){
        double myXleft = getX() - getWidth()/2;
        double myXright = getX() + getWidth()/2;
        double myYup = getY() + getHeight()/2;
        double myYdown = getY() - getHeight()/2;

        double Xleft = r.getX() - r.getWidth()/2;
        double Xright = r.getX() + r.getWidth()/2;
        double Yup = r.getY() + r.getHeight()/2;
        double Ydown = r.getY() - r.getHeight()/2;

        if ( (Math.abs(Xleft) <= Math.abs(myXleft)) &&
                (Math.abs(Xright) <= Math.abs(myXright)) &&
                (Math.abs(Yup) <= Math.abs(myYup)) &&
                (Math.abs(Ydown) <= Math.abs(myYdown))) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean overlaps(MyRectangle2D r){
        double myXleft = getX() - getWidth()/2;
        double myXright = getX() + getWidth()/2;
        double myYup = getY() + getHeight()/2;
        double myYdown = getY() - getHeight()/2;

        double Xleft = r.getX() - r.getWidth()/2;
        double Xright = r.getX() + r.getWidth()/2;
        double Yup = r.getY() + r.getHeight()/2;
        double Ydown = r.getY() - r.getHeight()/2;

        if ( (Math.abs(Xleft) <= Math.abs(myXleft)) ||
                (Math.abs(Xright) <= Math.abs(myXright)) ||
                (Math.abs(Yup) <= Math.abs(myYup)) ||
                (Math.abs(Ydown) <= Math.abs(myYdown))) {
            return true;
        }
        else{
            return false;
        }
    }

    // toString constructor to check the coordinate changes
    public String toString(){
        return ("center : " + x + ", " + y + "  Width & Height : " + width + ", " + height);
    }
}
