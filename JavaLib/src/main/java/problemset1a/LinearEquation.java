package problemset1a;

public class LinearEquation {

    public static void main(String[] args) {
        double a = 1.0; double b = 2.0; double c = 3.0;

        double d = 5.0; double e = 6.0; double f = 7.0;

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("x is " + equation.getX() + " and y is " + equation.getY());
        }
        else {
            System.out.println("The equation has no solution");
        }
        LinearEquation equation2 = new LinearEquation(1.25, 2.0, 2.0, 4.2, 3.0, 6.0);
        if (equation2.isSolvable()) {
            System.out.println("x is " + equation2.getX() + " y is " + equation2.getY());
        }
        LinearEquation equation3 = new LinearEquation(1.0,2.0, 2.0, 4.0, 3.0, 6.0);
        System.out.println(equation3.isSolvable());
        LinearEquation equation4 = new LinearEquation(1.0,4.0, 2.0, 4.0, 3.0, 6.0);
        System.out.println(equation4.isSolvable());
    }

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    LinearEquation( double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    //sometimes generator gives static but sometimes not -> why?
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public boolean isSolvable(){
        if (getA()*getD() - getB()*getC() != 0){
            return true;
        }
        else{
            return false;
        }
    }

    public double getY(){
        return (getE()*getC()-getF()*getA())/(getB()*getC()-getA()*getD());
    }

    public double getX(){
        return (getE()*getD()-getF()*getB())/ (getA()*getD()-getB()*getC()); }

}
