package week2;
//Find and remove duplicate elements in unsorted array
import java.util.Arrays;
public class v2Exer8 {
    public static int remDupElem(int[] myArray, int nm) {

        if (nm == 0 || nm == 1) {
            return nm;
        }
        int[] temp = new int[nm];
        int j = 0;
        for (int i = 0; i < nm - 1; i++) {
            if (myArray[i] != myArray[i + 1]) {
                temp[j++] = myArray[i];
            }
        }
        temp[j++] = myArray[nm - 1];
        // Changing original array
        if (j >= 0) System.arraycopy(temp, 0, myArray, 0, j);
        return j;
    }

    public static void main(String[] args) {
        System.out.println("This unsorted array ...");
        int[] myArray = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        for (int j : myArray) System.out.print(j + " ");
        Arrays.sort(myArray);
        int length = myArray.length;
        length = remDupElem(myArray, length);
        //printing array elements
        System.out.println(" ");
        System.out.println("...is now sorted : ");
        for (int i = 0; i < length; i++)
            System.out.print(myArray[i] + " ");
    }
}
