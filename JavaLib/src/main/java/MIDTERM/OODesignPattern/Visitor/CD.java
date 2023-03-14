package MIDTERM.OODesignPattern.Visitor;

public class CD implements Visitable{

    private double weight = 5;

    CD(){}

    CD(double weight){
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
