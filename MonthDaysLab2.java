import java.time.Month;

public class MonthDaysLab2 {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            int daysInMonth = month.length(false); // false means not a leap year
            System.out.println(month + ": " + daysInMonth + " days");
        }
    }
}
