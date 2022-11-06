package week4.DateTime;
import java.time.LocalDate;
import java.time.format.*;

public class Exer3 {

        public static void main(String[] args) {
            LocalDate d0 = LocalDate.now();
            String d0Str = d0.format(DateTimeFormatter.ISO_DATE);
            System.out.println("Today is:  " + d0Str);

            LocalDate d1 = LocalDate.of(2022, 10, 31);
            String d1Str = d1.format(DateTimeFormatter.ISO_DATE);
            System.out.println("But last monday was:  " + d1Str);

            LocalDate d2 = LocalDate.of(2022, 11, 1);
            String d2Str = d2.format(DateTimeFormatter.ISO_DATE);

            LocalDate d3 = LocalDate.of(2022, 11, 2);
            String d3Str = d3.format(DateTimeFormatter.ISO_DATE);

            LocalDate d4 = LocalDate.of(2022, 11, 3);
            String d4Str = d4.format(DateTimeFormatter.ISO_DATE);

            LocalDate d5 = LocalDate.of(2022, 11, 4);
            String d5Str = d5.format(DateTimeFormatter.ISO_DATE);

            LocalDate d6 = LocalDate.of(2022, 11, 5);
            String d6Str = d6.format(DateTimeFormatter.ISO_DATE);

            LocalDate d7 = LocalDate.of(2022, 11, 6);
            String d7Str = d7.format(DateTimeFormatter.ISO_DATE);

            LocalDate d8 = LocalDate.of(2022, 11, 7);
            String d8Str = d8.format(DateTimeFormatter.ISO_DATE);


            String[] day = {"Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            String[] djStr = {d2Str, d3Str, d4Str, d5Str, d6Str, d6Str, d7Str};

            int i = 0;

            while (i < 6) {
                System.out.println("... and following days :  ");
                for (int k = 0; k < 7; k++) {
                    System.out.print("   \n" + djStr[k+1] + "   " + day[k]);
                    i++;
                }
            }
        }
    }
