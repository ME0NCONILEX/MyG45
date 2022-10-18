package week2.strings;
//String manipulate and convert/store to array
public class v2Exer10s {
    public static void main(String[] args)
    {
        //initial string
        String myTxt = "ThisShouldBeConverted";
        char[] myCh = new char[myTxt.length()];
        // copying each element into array and print out
        for (int i = 0; i < myTxt.length(); i++) {
            myCh[i] = myTxt.charAt(i);
        }
        for (char c : myCh) {
            System.out.println(c);
        }
    }
}
