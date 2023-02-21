package week5.visitor;

import java.util.ArrayList;

public class VisitorExample {
    public static void main(String[] args) {
        Book b = new Book(2);
        Cookware cw = new Cookware(20);
        Clothing c = new Clothing(2);

        ArrayList<Visitable> arr = new ArrayList<>();
        arr.add(b);
        arr.add(cw);
        arr.add(c);

        Postage p = new Postage();
        IntlPostage ip = new IntlPostage();

        // Visit every item
        for (Visitable v: arr){
            v.accept(p);
            v.accept(ip);

            System.out.println(p.getTotal());
            System.out.println(ip.getTotal());
        }
    }
}
