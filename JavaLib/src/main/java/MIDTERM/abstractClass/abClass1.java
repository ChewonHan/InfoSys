package MIDTERM.abstractClass;

public abstract class abClass1 { // abstract class -> class that has an abstract method
    private int int1 = 5; // within this class only  -> use getter and setter
    int int2 = 3; // within this package
    public int int3 = 1; // within every class

    public int getInt1() {
        return int1;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    public abstract String output(); // abstract method
}
