package se.lexicon;
/*
 * 11.Write a program that ask the user for an integer and repeat that
 * question until user give you a specific value that user already has been
 * told about as a message in your program. Store these values in an array
 * and print that array. After that reverse the array elements so that the
 * first element becomes the last element, the second element becomes
 * the second to last element, etc. Do not just reverse the order in which
 * they are printed. You need to change the way they are stored in the
 * array.
 */
import java.util.*;
public class Exercise11 {
  public static void main(String[] args)
  {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the how many elements you want to store: ");
    //reading the number of elements
    n = sc.nextInt();
    //creates an array in the memory
    int[] myArray = new int[n];
    System.out.println("Enter the elements of the array: ");
    for(int i = 0; i < n; i++)
    {
      //reading array elements from the user
      myArray[i]=sc.nextInt();
    }

    // accessing array elements using the for loop
    {
      int i = 0;
      while (i < n) {
        i++;
      }
    }
    System.out.println("The elements added to the array are:\n"
            + Arrays.toString(myArray) + "\n");
    // reversing the array
    for (int i = 0; i < myArray.length / 2; i++) {
      int temp = myArray[i];
      myArray[i] = myArray[myArray.length - 1 - i];
      myArray[myArray.length - 1 - i] = temp;
    }
    System.out.println("... and the sorted/reversed array:\n"
            + Arrays.toString(myArray) + "\n");
  }
  public static void ex11() {
  }
}
