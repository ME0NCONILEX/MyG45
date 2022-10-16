package week1;
// Console-based calculator
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class v1Exer9 {
    private static final DecimalFormat decfor = new DecimalFormat();

    public static void main(String[] args) {

        boolean go = true;

        while (go) {
            System.out.println("Hello this is a simple console-based  calculator!");
            System.out.println("To add, type a | to subtract type s | to multiply, type m | to divide, type d");


            Scanner scan = new Scanner(System.in);    //sets up scanners
            Scanner scan1 = new Scanner(System.in);


            String action = scan.nextLine();    //tells comp. to take user input

            if ("a".equals(action))    //addition
            {
                System.out.println("Now type in the first number you would like to add.");
                BigInteger add1 = scan.nextBigInteger();
                System.out.println("Now type the second number.");
                BigInteger add2 = scan.nextBigInteger();
                BigInteger add3 = add1.add(add2);
                System.out.println(add1 + " added to " + add2 + " equals " + add3 + "!");
            }
            if ("s".equals(action))    //subtraction
            {
                System.out.println("Now type in the first number you would like to subtract.");
                BigInteger sub1 = scan.nextBigInteger();
                System.out.println("Now type the second number.");
                BigInteger sub2 = scan.nextBigInteger();
                BigInteger sub3 = sub1.add(sub2);
                System.out.println(sub1 + " subtracted bye " + sub2 + " equals " + sub3 + "!");
            }
            if ("m".equals(action))    //multiplacation
            {
                System.out.println("Now type in the first number you would like to multiply.");
                int mult1 = scan.nextInt();
                System.out.println("Now type the second number.");
                int mult2 = scan.nextInt();
                int mult3 = mult1 * mult2;
                System.out.println(mult1 + " multiplied bye " + mult2 + " equals " + mult3 + "!");
            }
            if ("d".equals(action))    //division
            {
                System.out.println("Now type in the first number you would like to divide.");
                int div1 = scan.nextInt();
                System.out.println("Now type the second number.");
                int div2 = scan.nextInt();
                double div2K = div2;
                double div3 = div1 / div2K;
                System.out.println(div1 + " divided bye " + div2 + " equals " + decfor.format(div3) + "!");
            }

            System.out.println("Would you like to start over? (yes,no)");
            String startOver = scan1.nextLine();

            if ("no".equals(startOver)) {
                go = false;
                System.out.println("Good Bye!");
            }
        }
    }
}