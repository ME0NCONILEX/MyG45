package week2;
//Array & average of its elements
public class v2Exer6 {
    static double averageCalculate(int[] myArray, int n) {
        // The sum of array's elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += myArray[i];
        }
        return (double) sum / n;
    }

    public static void main(String[] args) {
        System.out.println("The average of all the elements in this array: " );
        int n = 6;  //Declare array size
        int[] myArray = new int[]{43, 5, 23, 17, 2, 14};
        for (int i = 0; i < n; i++) {     //Initialize the array
            System.out.print(myArray[i] + " ");
        }
        System.out.println(" is: " + averageCalculate(myArray, n));
    }
}
