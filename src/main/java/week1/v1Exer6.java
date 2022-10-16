package week1;
import java.util.Scanner;

public class v1Exer6 {
    public static void main(String[] args)
    {
        System.out.println("Hi! Please enter two numbers: ");
        Scanner mysc = new Scanner(System.in);
        int numb1 = mysc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int numb2 = sc1.nextInt();
        int a = (numb1 + numb2); int m = (numb1 * numb2); int d = (numb1 / numb2); int s = (numb1 - numb2);
        System.out.println("Okay, here follow a simple arithmetic example: ");
        System.out.println(("addition: " + " = " + a ));
        System.out.println(("multiplication: " + " = " + m ));
        System.out.println(("division: " + " = " + d ));
        System.out.println(("subtraction: " + " = " + s ));
    }
}
