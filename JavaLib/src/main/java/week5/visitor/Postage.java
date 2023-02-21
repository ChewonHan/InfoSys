package week5.visitor;

public class Postage implements Visitor{

    // total attribute
    private double total = 0;

    @Override
    public void visit(Book b) { // Method overloading: same method but diff parameters
        total += b.getWeight() * 5;
    }

    @Override
    public void visit(Cookware cw) {
        total += cw.getVolume() * 0.8;
    }

    @Override
    public void visit(Clothing c) {
        total += c.getSize() * 0.5;
    }

    public double getTotal() {
        return total;
    }
}
