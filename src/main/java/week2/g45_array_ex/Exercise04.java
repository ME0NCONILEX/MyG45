package se.lexicon;
/*
 * 4. Write a program which will copy the elements of one array into another array.
 * Expected output:
 *                Elements from first array: 1 15 20
 *                Elements from second array: 1 15 20
 */
public class Exercise04 {
  public static void main (String[] args) {
      int[] myArray1 = new int[]{1, 15, 20};  //Original array of 3 numbers
      int[] myArray2 = new int[myArray1.length];
      System.arraycopy(myArray1, 0, myArray2, 0, myArray1.length);
      System.out.println("Elements from my first array: ");
      for (int j : myArray1) {
        System.out.print(j + " ");
      }
      System.out.println();

      System.out.println("... And the elements from the second (copied) array: ");
      for (int j : myArray2) {
        System.out.print(j + " ");
      }
    }
  public static void ex4() {
  }
}
