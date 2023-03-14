package MIDTERM.OODesignPattern.VisitorAct;

public class Car implements Tax_able{

    private double normalPercent = 30;
    private double holidayPercent = 50;

    Car(){}

    Car(double normalPercent, double holidayPercent){
        this.normalPercent = normalPercent;
        this.holidayPercent = holidayPercent;
    }

    public double getNormalPercent() {
        return normalPercent;
    }

    public void setNormalPercent(double normalPercent) {
        this.normalPercent = normalPercent;
    }

    public double getHolidayPercent() {
        return holidayPercent;
    }

    public void setHolidayPercent(double holidayPercent) {
        this.holidayPercent = holidayPercent;
    }

    @Override
    public void accept(Tax_er tx) {
        tx.visit(this);
    }
}
