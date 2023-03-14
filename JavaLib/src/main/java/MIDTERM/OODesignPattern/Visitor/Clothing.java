package MIDTERM.OODesignPattern.Visitor;

public class Clothing implements Visitable{

    private double weight = 5;

    Clothing(){}

    Clothing(double weight){
        this.weight = weight;
    }

    public void accept (Visitor v){
        v.visit(this);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
