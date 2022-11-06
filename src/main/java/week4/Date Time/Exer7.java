package week4.DateTime;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exer7 {
    public static void main(String[] args) {
        System.out.println("Period.between: ");
        LocalDate oldDate = LocalDate.of(1945, 5,8);
        LocalDate newDate = LocalDate.of(1959, 1, 29);
        String oldDateStr = oldDate.format(DateTimeFormatter.ISO_DATE);
        String newDateStr = newDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println(oldDateStr + " -- " + newDateStr);
        // Period between dates
        Period period = Period.between(oldDate, newDate);
        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");
    }
}
