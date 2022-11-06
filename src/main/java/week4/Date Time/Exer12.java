package week4.DateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Exer12 {
    public static void main(String[] args) {
        convertStringToLocalTime();
    }

    private static void convertStringToLocalTime() {
        LocalTime isoTime = LocalTime.parse("10:32:53", DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(isoTime);
    }
}
