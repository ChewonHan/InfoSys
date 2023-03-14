package MIDTERM.OODesignPattern.Visitor;

public interface Visitable {
    void accept (Visitor v); // can be more methods specific for items
    // need to be overridden in the each item
}
