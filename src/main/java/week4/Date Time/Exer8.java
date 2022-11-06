package week4.DateTime;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
// Manipulate date and time using LocalDateTime
public class Exer8 {

    public static void main(String[] args) {

        Period Years = Period.ofYears(4);
        Period Month = Period.ofMonths(7);
        Period Days = Period.ofDays(29);
        String years1 = String.valueOf(Years.getYears());
        String month1 = String.valueOf(Month.getMonths());
        String days1 = String.valueOf(Days.getDays());
        LocalDate d0 = LocalDate.now();
        String d0Str = d0.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Today is:  " + d0Str + " but after ...");

        String newPeriodStr = ("... period of " + years1 +" years " + month1 + " month and " + days1 + " days will be: ");
        LocalDate newDate =  d0.plusDays(29);
        LocalDate newDate1 =  newDate.plusMonths(7);
        LocalDate newDate2 = newDate1.plusYears(4);

        System.out.println(newPeriodStr + newDate2);
    }
}
