package MIDTERM.OODesignPattern.Visitor;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Visitable> list = new ArrayList<Visitable>();
        PostageVisitor postage = new PostageVisitor();

        list.add(new Book(1));
        list.add(new CD(3));
        list.add(new Clothing(4));

        for (Visitable o: list){
            o.accept(postage);
        }

        System.out.println(postage.getTotal());
    }
}
/***
 * Visitable is connected with the items
 * Visitor is connected with the concrete class that gets the required value
 *
 * in this case, visitable connects with bool, cd, and clothing
 * visitor connect with the weight of each item
 *
 * use the visitable to make a list to store objects
 * use the postageVisitor (weight) to compute the weight of each item
 */
