package week2.strings;
//Strings - indexOf position for a character
public class v2Exer1s {
    public static void main(String[] args) {
        String myTxt = "Long example sentence";
        int j = myTxt.length();
        for (int i = 0; i < j; i++) {
            if (i == 6) {
                System.out.println("The character on index position " + i + " is: " + myTxt.charAt(i));
            }
        }
    }
}
