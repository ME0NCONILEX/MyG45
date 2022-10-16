package week2;
//Sorting string array
import java.util.Arrays;
public class v2Exer3 {
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
}

