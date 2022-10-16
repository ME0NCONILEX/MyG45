package week1;
import java.util.Scanner;
public class v1Exer7 {

    public static void main(String[] args)
    {
        int secondsK = 86399;
        System.out.println("Hi! If you only want to convert: " + secondsK + " in HH:MM:SS  ...");
        int quant1K = secondsK % 60;
        int quant2K = secondsK / 60;
        int quant3K = quant2K % 60;
        quant2K = quant2K / 60;
        System.out.println("... you get this answer : ");
        System.out.println( quant2K + ":" + quant3K + ":" + quant1K);

        System.out.print("\n");

        System.out.println("Otherwise, please enter another number of seconds you want to convert: ");
        Scanner in = new Scanner(System.in);

        int seconds = in.nextInt();

        int quant1 = seconds % 60;
        int quant2 = seconds / 60;
        int quant3 = quant2 % 60;

        quant2 = quant2 / 60;

        System.out.println("This is your result : ");
        System.out.println("Hours (HH) : " + quant2);
        System.out.println("Minutes (MM) :  " + quant3);
        System.out.println("Seconds (SS) - " + quant1);

        System.out.print("\n");
    }
}
