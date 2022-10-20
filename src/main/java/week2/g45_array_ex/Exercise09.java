package se.lexicon;
/*
 * 9. Write a method which will add elements in an array.
 * Remember that arrays are fixed in size so you need to come up with a
 * solution to “expand” the array
 */
import java.util.Arrays;
public class Exercise09 {
  public static void main(String[] args)
  {
    // initial array of size 10
    int[] myArray
            = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    // print the original array
    System.out.println("The initial array:\n"
            + Arrays.toString(myArray) + "\n");
    // 9 new elements to be added
    int[] myExtArray
            = { 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    // print the add array
    System.out.println("The new array/elements to add to the initial array:\n"
            + Arrays.toString(myExtArray) + "\n");
    // the method to add new elements in initial array
    int[] result = new int[myArray.length + myExtArray.length];
    System.arraycopy(myArray, 0, result, 0, myArray.length);
    System.arraycopy(myExtArray, 0, result, myArray.length, myExtArray.length);
    System.out.println("And finally, the new extended array:");
    System.out.println(Arrays.toString(result));
  }
  public static void ex9() {
  }
}

