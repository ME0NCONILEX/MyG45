package week2;
//The diagonal elements of two dimensional array
public class v2Exer12 {
    public static void main(String[] args) {
        //creates an array
        int[][] my2DArray = new int[3][3];
        int column = 1, row = 1;
        int i = 0;
        while (i < my2DArray.length) {
            int j = 0;
            while (j < my2DArray[i].length) {
                my2DArray[i][j] = row * column;
                column = column + 1;
                j++;
            }
            column = 1;
            row = row + 1;
            i++;
        }
        System.out.println("The 2D array:");
        i = 0;
        while (i < my2DArray.length) {
            int j = 0;
            while (j < my2DArray[i].length) {
                System.out.print(" " + my2DArray[i][j] + "\t");
                j++;
            }
            System.out.print("\n");
            i++;
        }
        System.out.println("The diagonal elements in the 2D array:");
        for (int k = 0; k < my2DArray.length; k++) {
            System.out.print(my2DArray[k][k] + "\t");
        }
    }
}
