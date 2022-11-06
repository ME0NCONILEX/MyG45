package week4.DateTime;
import java.time.LocalTime;
public class Exer10 {
    public static void main(String[] args) {
        getHourMinuteSecondfromLocalTime();
    }

    private static void getHourMinuteSecondfromLocalTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println("From the actual local time " + localTime + " we get " + localTime.getNano()+ " nano seconds.");
    }
}
