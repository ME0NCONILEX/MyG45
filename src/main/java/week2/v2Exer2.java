package week2;
// Method to find the index of an element
public class v2Exer2 {
    public static int indexOf(int[] arr, int t)
    {
        // if array is Null
        if (arr == null) {
            return -1;
        }
        // find length of array
        int len = arr.length;
        int i = 0;
        // traverse in the array
        while (i < len) {
            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
    // Driver Code
    public static void main(String[] args)
    {
        int[] myArray = { 7, 6, 5, 4, 3, 2, 8, 9 };
        System.out.println("The array list is as fallows: " + "7, 6, 5, 4, 3, 7, 8, 9");
        // find the index of 5
        System.out.println("Of course, the index position of 5 is: "
                + indexOf(myArray, 5));
    }
}
