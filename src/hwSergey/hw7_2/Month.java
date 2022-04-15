package hwSergey.hw7_2;

public class Month {

//—оздать класс Month с пол€ми:
// им€ мес€ца, количеством дней и количеством рабочих дней.
// —оздать класс MonthUtils который бы хранил
// подготовленные мес€цы или их массивы дл€ использовани€ (объекты класса Month).

private String month;
private int days;
private int workDays;

    public Month(String month, int days, int workDays) {
        this.month = month;
        this.days = days;
        this.workDays = workDays;
    }

    public String getMonth() {
        return month;
    }

    public int getDays() {
        return days;
    }

    public int getWorkDays() {
        return workDays;
    }
}
