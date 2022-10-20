package se.lexicon;
/*
 * 13. Create two arrays with arbitrary size and fill one with random numbers.
 * Then copy over the numbers from the array with random numbers so
 * that the even numbers are located in the rear (the right side) part of the
 * array and the odd numbers are located in the front part (the left side).
 */
import java.util.*;
public class Exercise13 {
  public static void main(String[] args)
  {
    // size of the array
    System.out.print("The initial array: ");
    // create initial array of size n
    int[] myArray = {1,7,5,2,8};

    int i = 0;
    while (i < myArray.length) {
      i++;
    }
    System.out.println("... and the sorted/reversed array:\n"
            + Arrays.toString(myArray) + " with: ");
    // display odd-even
    displayOddEven(myArray);

  }
  // method to display even or odd in array
  public static void displayOddEven(int[] numbers) {
    // variables
    int countEven = 0;
    int countOdd;
    int[] even;
    int[] odd;
    // count even numbers
    for (int i : numbers) {
      if (i % 2 == 0) {
        ++countEven;
      }
    }
    // count odd numbers
    countOdd = numbers.length - countEven;

    // create array to store odd and even numbers
    even = new int[countEven];
    odd = new int[countOdd];

    // check each element and insert
    // them in appropriate array
    int i = 0;
    int j = 0;
    for (int num : numbers) {
      if (num % 2 == 0) { // even
        even[i++] = num;
      } else {
        odd[j++] = num;
      }
    }
    int[] result = new int[odd.length + even.length];
    int index = 0;

    for (int item: odd) {
      result[index++] = item;
    }
    for (int item: even) {
      result[index++] = item;
    }

    // display even & odd arrays
    System.out.println("* Even numbers: "
            + Arrays.toString(even));
    System.out.println("* Odd numbers: "
            + Arrays.toString(odd));

    System.out.println("The new array with the odd numbers att the left: \n" + Arrays.toString(result));
  }
  public static void ex13() {
  }
}
