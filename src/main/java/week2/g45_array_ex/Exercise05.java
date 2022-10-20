package se.lexicon;
/*
 * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
 * Expected output:
 *              France Paris
 *              Sweden Stockholm
 */
public class Exercise05 {
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
  public static void ex5() {
  }
}
