package week2;
//Array sort and print only its odd numbers
public class v2Exer7 {
    public static void main(String[] args) {
        System.out.println("This array's ...");
        int[] myArray = {1, 2, 4, 7, 9, 12};
        for (int k : myArray) {
            System.out.print(k + " ");
        }
        System.out.println(" ");
        System.out.println("... odd numbers are: ");
        for (int i : myArray) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
