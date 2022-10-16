package week2;
//Adding elements in an array after expanded array
import java.util.*;
public class v2Exer9 {
    // Driver code
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
}
