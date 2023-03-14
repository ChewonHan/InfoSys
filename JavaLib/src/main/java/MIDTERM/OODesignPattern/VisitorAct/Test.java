package MIDTERM.OODesignPattern.VisitorAct;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Tax_able> list = new ArrayList<Tax_able>();
        Tax_vis tx_vis = new Tax_vis();

        list.add(new Chocolate());
        list.add(new Car());
        list.add(new Alcohol());


        for (Tax_able o: list){
            o.accept(tx_vis);
        }

        System.out.println(tx_vis.getHolidayPercent() + "for the holidays");
        System.out.println(tx_vis.getNormalPercent() + " for the normal days");
    }
}
