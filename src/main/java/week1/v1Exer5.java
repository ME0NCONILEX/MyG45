package week1;
import java.util.Scanner;

public class v1Exer5 {
    public static void main(String[] args)
    {
        System.out.println("Hi! Please tell me your name: ");
        Scanner mysc = new Scanner(System.in);
        String username = mysc.nextLine();
        System.out.println("Hello " +  username + "! How nice to see you here!");
    }
}
