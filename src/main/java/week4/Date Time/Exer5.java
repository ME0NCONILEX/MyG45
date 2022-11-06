package week4.DateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// Import the DateTimeFormatter class
public class Exer5 {
    public static void main(String[] args) {
        getYearMonthDayFromLocalDateTime();
    }
    private static void getYearMonthDayFromLocalDateTime() {
        LocalDate d = LocalDate.of(1945, 5,8);
        String dStr = d.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date: " + dStr);
        System.out.println("With day of Week : " + d.getDayOfWeek());
    }
}
