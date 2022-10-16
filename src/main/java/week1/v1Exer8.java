package week1;
import java.util.Scanner;

public class v1Exer8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int rnd_nmb; // Comp's random number
        int gcnmb;  // Guest's number
        int attempt = 0; // Guest's attempts
        int mynmbs = 1; // From
        int mynmbe = 500; // To

        System.out.println("The computer choose a number between " + mynmbs + " and " + mynmbe + "...");
        System.out.print("\n");

        rnd_nmb = (int) (Math.random() * mynmbe) + 1; // Computers random number

        System.out.println("So, let us start the simple funny guess-game: ");
        System.out.println();
        do
        {
            System.out.println("... Enter your guess between " + mynmbs + " and " +  mynmbe);
            gcnmb = console.nextInt();

            attempt++;

            if (gcnmb > rnd_nmb)
            {
                System.out.println("Your guess was too big... Try again");
            }
            else if (gcnmb < rnd_nmb)
            {
                System.out.println("Your guess was too small... Try again");
            }
            else
            {
                System.out.println("Congratulation! You guess is correct! After " + attempt + " guesses!");
            }

        }while (gcnmb != rnd_nmb);
    }
}
