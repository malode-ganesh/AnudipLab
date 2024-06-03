import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class IndependenceDayCheckLab2B {

    public static void main(String[] args) {
        // Create a MonthDay object for Independence Day (15th August)
        MonthDay independenceDay = MonthDay.of(Month.AUGUST, 15);
        
        // Get the current date
        LocalDate today = LocalDate.now();
        
        // Check if today is Independence Day
        if (MonthDay.from(today).equals(independenceDay)) {
            System.out.println("Today is Independence Day (15th August).");
        } else {
            // Check if today is before or after Independence Day
            if (MonthDay.from(today).isBefore(independenceDay)) {
                System.out.println("Independence Day is yet to come this year.");
            } else {
                System.out.println("Independence Day was already celebrated this year.");
            }
        }
    }
}
