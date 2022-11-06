package week4.DateTime;
import java.time.LocalTime;
public class Exer9 {
    public static void main(String[] args) {
        createLocalTime();
    }
    private static void createLocalTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
