package week4;

import sun.jvm.hotspot.debugger.Page;

public class InterfaceTest {
    public static void main(String[] args) {
        BoxA a = new BoxA();
        BoxB b = new BoxB();

        a.commandOnClick();
        b.commandOnClick();
        b.drag();

        setComponentColor(a);
        setComponentColor(b);

        System.out.println("Box A " + a.getColor());
        System.out.println("Box B " + b.getColor());
    }

    public static void setComponentColor(PageComponent p){
        String col = "Grey";
        if (p instanceof Clickable){
            col = "Blue";
        }
        p.setColor(col);
        // ((PageComponent)p).setColor(col); also works the same
    }
}

class PageComponent{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// BoxA implement Clickable. BoxA have to define commandOnClick()
class BoxA extends PageComponent implements Clickable{
    @Override
    public void commandOnClick() {
        System.out.println("BoxA is clicked");
    }
}

// can inherit only one class
class BoxB extends PageComponent implements Clickable, Draggable {
    @Override
    public void commandOnClick() {
        System.out.println("BoxB is clicked. Go to page X");
    }

    @Override
    public void drag() {
        System.out.println("BoxB is dragged");
    }
}

interface Clickable {
    void commandOnClick();
}

interface Draggable {
    void drag();
}