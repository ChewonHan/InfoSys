package MIDTERM.OODesignPattern.Visitor;

public interface Visitor { // this interface will visit all three items
    void visit(Book b);
    void visit (CD c);
    void visit (Clothing c);
}
