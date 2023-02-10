package problemset1a;

// FINAL WORK

public class MyRectangle2D_4 {

    public static void main(String[] args) {
        MyRectangle2D_3 rec2 = new MyRectangle2D_3(2,3,6,2);
        System.out.println(rec2.getPerimeter());
        System.out.println(rec2.contains(-10,-10)); // shld be false
        System.out.println(rec2.contains(2,3)); // shld be true
        System.out.println(rec2.contains(-1,4));
        MyRectangle2D_3 rec3 = new MyRectangle2D_3();
        System.out.println(rec3.contains(-1,4));
        /*MyRectangle2D_3 rec3 = new MyRectangle2D_3(2,3,2,1);
        MyRectangle2D_3 rec4 = new MyRectangle2D_3(2,3,6,1);
        System.out.println(rec2.contains(rec3));
        System.out.println(rec2.contains(rec4));*/
        // System.out.println("rec2" + rec2.toString());

    }

    // What does specify the center of the rectangle with get and set methods? -> need to create a constructor or attributes?

    // Need to try more on Overlaps got deducted

    /* <<RESOLVED>> Prob I have now: once I create a new object (rec2) the width and height for rec1 also are changed (set):
    (Width, Height) should be remained (3,6) but becomes (6,2)
    HOW:
    - delete the static for every variables because each object has diff inputs (variables)
    - deleted statics for setter and getter due to the above reason
      <referred to the Account.java file> */
    double x;
    double y;
    double width;
    double height;

    MyRectangle2D_4(){
        this(0.0,0.0,1.0,1.0);
    }

    MyRectangle2D_4(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        // Should it be getHeight()*getWidth() ?
        return (height*width);
    }

    public double getPerimeter(){
        return ((height+width)*2);
    }

    public boolean contains(double x, double y){
        double halfHeight = getHeight() / 2.0;
        double halfWidth = getWidth() / 2.0;

        if ((y <= getY() + halfHeight) &&
                (y >= getY() - halfHeight) &&
                (x <= getX() + halfWidth) &&
                (x >= getX() - halfWidth)){
            return true;
        }
        else{
            return false;
        }
    }

    // my() is the original rectangle coordinate
    // () is this. rectangle

    // my: 2,3,6,2
    // input: 2,3,2,1
    public boolean contains(MyRectangle2D_4 r ){
        double myXleft = (getX() - getWidth()/2); // -1
        double myXright = (getX() + getWidth()/2); // 5
        double myYup = (getY() + getHeight()/2); // 4
        double myYdown = (getY() - getHeight()/2); // 2

        double Xleft = (r.getX() - r.getWidth()/2); // 1
        double Xright = (r.getX() + r.getWidth()/2); // 3
        double Yup = (r.getY() + r.getHeight()/2); // 3.5
        double Ydown = (r.getY() - r.getHeight()/2); // 2.5

        if ( ((Xleft) >= (myXleft)) &&
                ((Xright) <= (myXright)) &&
                ((Yup) <= (myYup)) &&
                ((Ydown) >= (myYdown))) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean overlaps(MyRectangle2D_4 r){
        double myXleft = getX() - getWidth()/2;
        double myXright = getX() + getWidth()/2;
        double myYup = getY() + getHeight()/2;
        double myYdown = getY() - getHeight()/2;

        double Xleft = r.getX() - r.getWidth()/2;
        double Xright = r.getX() + r.getWidth()/2;
        double Yup = r.getY() + r.getHeight()/2;
        double Ydown = r.getY() - r.getHeight()/2;

        if (
                ( (myXleft <= Xleft) && (myXright >= Xleft) && (myYdown <= Yup) && (myYup >= Yup) ) ||
                        ( (myXleft <= Xright) && (myXright >= Xright) && (myYdown <= Yup) && (myYup >= Yup) )   ||
                        ( (myXleft <= Xleft) && (myXright >= Xleft) && (myYdown <= Ydown) && (myYup >= Ydown) ) ||
                        ( (myXleft <= Xright) && (myXright >= Xright) && (myYdown <= Ydown) && (myYup >= Ydown) )
        )
        {
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

