package week2;
//Two-dimensional string array
public class v2Exer5 {
    public static void main(String[] args) {
        String[][] countcap = {{"France","Paris"},{"Sweden","Stockholm"}};
        System.out.println("Country" + " Capital");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(countcap[i][j] + " ");
            }
            System.out.println();
        }
    }
}
