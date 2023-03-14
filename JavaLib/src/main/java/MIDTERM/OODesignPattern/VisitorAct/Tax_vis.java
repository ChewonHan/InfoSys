package MIDTERM.OODesignPattern.VisitorAct;

public class Tax_vis implements Tax_er{

    double normalPercent = 0;
    double holidayPercent = 0;

    @Override
    public void visit(Car c) {
        normalPercent += c.getNormalPercent();
        holidayPercent += c.getHolidayPercent();
    }

    @Override
    public void visit(Alcohol a) {
        normalPercent += a.getNormalPercent();
        holidayPercent += a.getHolidayPercent();
    }

    @Override
    public void visit(Chocolate ch) {
        normalPercent += ch.getNormalPercent();
        holidayPercent += ch.getHolidayPercent();
    }

    public double getNormalPercent() {return normalPercent; }

    public double getHolidayPercent() {return holidayPercent; }
}
