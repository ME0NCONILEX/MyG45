package se.lexicon;
/*
 * 3. Write a program which will sort string array.
 * Expected output:
 *                String array: [Paris, London, New York, Stockholm]
 *                Sort string array: [London, New York, Paris, Stockholm]
 */
import java.util.Arrays;
public class Exercise03 {
  public static void main(String[] args)
  {
    String[] capitals = {"Paris", "London", "New York", "Stockholm"};
    System.out.println("===== Before selection sorting =====");
    System.out.println(Arrays.toString(capitals));
    int size = capitals.length;
//logic for sorting
    for(int i = 0; i<size-1; i++)
    {
      for (int j = i+1; j<capitals.length; j++)
      {
//compares each elements of the array to all the remaining elements
        if(capitals[i].compareTo(capitals[j])>0)
        {
//swapping array elements
          String temp = capitals[i];
          capitals[i] = capitals[j];
          capitals[j] = temp;
        }
      }
    }
//prints the sorted array in ascending order
    System.out.println("===== After selection sorting =====");
    System.out.println(Arrays.toString(capitals));
  }

  public static void ex3() {
  }
}
