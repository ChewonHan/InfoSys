package week5.factory;

public class ShapeFactory extends AbstractFactory{
    @Override
    Product getProduct(String s) {
        if (s.compareToIgnoreCase("Circle")==0) return new Circle();
        else if (s.compareToIgnoreCase("Rectangle")==0) return new Rectangle();
        else if (s.compareToIgnoreCase("Triangle")==0) return new Triangle();
        return null;
    }
}
