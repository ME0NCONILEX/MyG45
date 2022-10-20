package se.lexicon;
/*
 * 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
 * Expected output: Array: 1 2 4 7 9 12
 * Odd Array: 1 7 9
 */
public class Exercise07 {
  public static void main(String[] args) {
    System.out.println("This array's ...");
    int[] myArray = {1, 2, 4, 7, 9, 12};
    for (int k : myArray) {
      System.out.print(k + " ");
    }
    System.out.println(" ");
    System.out.println("... odd numbers are: ");
    for (int i : myArray) {
      if (i % 2 != 0) {
        System.out.print(i + " ");
      }
    }
  }
  public static void ex7() {
  }
}
