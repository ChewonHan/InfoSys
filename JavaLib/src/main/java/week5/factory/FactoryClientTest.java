package week5.factory;

public class FactoryClientTest {
    public static void main(String[] args) {
        // Create factory object
        ShapeFactory sf = new ShapeFactory();

        // Create objects based on request
        Product p1 = sf.getProduct("CIRCLE");
        Product p2 = sf.getProduct("TrianglE");
        Product p3 = sf.getProduct("ReCtAngLe");
        Product p4 = sf.getProduct("circle");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
