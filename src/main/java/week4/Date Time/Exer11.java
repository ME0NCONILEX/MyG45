package week4.DateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Exer11 {
    public static void main(String[] args) {
        convertStringToLocalTime();
    }

    private static void convertStringToLocalTime() {
        LocalTime isoTime = LocalTime.parse("11:18:40", DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("ex1: " + isoTime);

        // hour-of-day (0-23)
        LocalTime localTime = LocalTime.parse("21:25:20", DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("ex2: " + localTime);

        // clock-hour-of-am-pm (1-24)
        LocalTime localTime2 = LocalTime.parse("19:15:10", DateTimeFormatter.ofPattern("kk:mm:ss"));
        System.out.println("ex3: " + localTime2);


    }
}

