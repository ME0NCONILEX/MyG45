package week4.DateTime;
import java.time.*;
public class Exer4 {
    public static void main(String[] ar) {
        String dInStr = "2022-11-05";
        LocalDate d1 = LocalDate.parse(dInStr);
        System.out.println("String to LocalDate using parse() method : " + d1);
    }
}

