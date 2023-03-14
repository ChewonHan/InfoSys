package MIDTERM.OODesignPattern.VisitorAct;

public interface Tax_er {
    void visit(Car c);
    void visit(Alcohol a);
    void visit(Chocolate ch);
}
