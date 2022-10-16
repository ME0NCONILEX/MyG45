package week1;
import java.util.Scanner;

public class v1Exer2 {
    public static void checkYear(int year) {
        if (year % 400 == 0) {
            System.out.println("Yes, " + year + " is a leap year");
        } else if (year % 100 == 0) {
            System.out.println("No, " + year + " is not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Yes, " + year + " is a leap year");
        } else {
            System.out.println("No, " + year + " is not a leap year");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year you wish to check:");
        int year = s.nextInt();
        checkYear(year);
        System.out.println("God bye!");
    }
}
