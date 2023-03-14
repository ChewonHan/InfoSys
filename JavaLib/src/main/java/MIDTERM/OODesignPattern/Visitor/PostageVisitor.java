package MIDTERM.OODesignPattern.Visitor;

public class PostageVisitor implements Visitor{
    private double total = 0;

    @Override
    public void visit(Book b) {
        total += b.getWeight()*5;
    }

    @Override
    public void visit(CD c) {
        total += c.getWeight()*2;
    }

    @Override
    public void visit(Clothing c) {
        total += c.getWeight()*7;
    }

    public double getTotal(){
        return total;
    }
}
