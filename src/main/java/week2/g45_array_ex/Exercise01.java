package se.lexicon;
/**
 * 1. Write a program which will store elements in an array of type ‘int’ and
 * print it out.
 * Expected output: 11 23 39 etc.
 */
public class Exercise01 {
  public static void main(String[] args) {
    System.out.println("We have the start from number 11 and we'll build an array withholding 10 elements : ");
    int mystartnumb = 10;
    //declaring and initializing my array
    for (int i = 0; i < mystartnumb; i++) {
      int a = i + 1;
      int myArray = a * mystartnumb + (a*a);
      //printing corrected array
      if (myArray == 24) {
        System.out.println("Element at row " + (i+1) + " : " + (myArray - 1) + "  * corrected element");
      }else {
        System.out.println("Element at row " + (i+1) + " : " + myArray);
      }
    }
  }

  public static void ex1() {
  }
}

