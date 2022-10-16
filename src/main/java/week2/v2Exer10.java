package week2;
//Multiplication table in an multidimensional array
public class v2Exer10 {
    public static void main (String[] args){
        int[][] myMultTable = new int[10][10];
        int column = 1, row = 1;
        int i = 0;
        while(i<myMultTable.length){
            int j = 0;
            while(j<myMultTable[i].length){
                myMultTable[i][j]=row*column;
                column = column + 1;
                j++;
            }
            column = 1;
            row = row + 1;
            i++;
        }
        i=0;
        while(i<myMultTable.length){
            int j = 0;
            while( j<myMultTable[i].length){
                System.out.print(" " +myMultTable[i][j] + "\t: ");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
