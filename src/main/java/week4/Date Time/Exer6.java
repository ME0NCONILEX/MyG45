package week4.DateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
// Add and subtract using LocalDateTime
public class Exer6 {
    public static void main(String[] args) {
        addOrSubstractUsingLocalDateTime();
    }
    private static void addOrSubstractUsingLocalDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDate localDate = dateTime.toLocalDate();
        System.out.println("Today's date : " + localDate);
        LocalDate newDate = localDate.plusYears(10);
        LocalDate newDate1 =  newDate.minusMonths(10)   ;
                System.out.println("With 10 years addition: --> " + newDate + " " +
                "and minus 10 month: --> " +  newDate1);
    }
}

