package week4.DateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Exer16 {
    public static void main(String[] args) {
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);

        String myObjStr = myObj.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Today is:  " + myObjStr);

        LocalDate myObj1 = LocalDate.now();
        LocalTime myObj2 = LocalTime.now();
    }
}
