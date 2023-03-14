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
