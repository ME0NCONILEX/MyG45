package week4.DateTime;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
// this exercise must be reworked
public class Exer14 {

    public static void main(String[] args) {
//        LocalDate d1 = LocalDate.of(2022, 11, 3);
//        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
//        LocalTime time = LocalTime.now();
//        System.out.println(time.format(formatter));

        String pattern = "EEEEE dd MMMMM HH:mm";
        LocalDate d = java.time.LocalDate.of(2022, 11, 3);
        SimpleDateFormat sdfWithLocale = new SimpleDateFormat(pattern,
                new Locale("sv", "SV"));
        String date = sdfWithLocale.format(new Date());

        System.out.println(date);





    }
    }

