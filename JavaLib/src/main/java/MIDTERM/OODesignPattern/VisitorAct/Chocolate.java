package MIDTERM.OODesignPattern.VisitorAct;

public class Chocolate implements Tax_able{

    private double normalPercent = 10;
    private double holidayPercent = 20;

    Chocolate(){}

    Chocolate(double normalPercent, double holidayPercent){
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
