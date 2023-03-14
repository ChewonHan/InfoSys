package week8;

public class TestTea {
    public static void main(String[] args) {
        Tea2.TeaBuilder teaBuilder = new Tea2.TeaBuilder();
        // Builder design pattern
        /** Builder Design Pattern
         * For constructors with many many options
         * e.g. StringBuilder */
        Tea2 tea = teaBuilder.setSugar(true).setMilk(true).setIce(true).build();

    }
}
