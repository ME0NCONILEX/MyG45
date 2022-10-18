package week2.strings;
//String manipulate and convert/store to array
public class v2Exer11s {
    public static void main(String[] args)
    {
        //the initial character array
        String myTxt = "The initial character array: \n  'J', 'a', 'v', 'a'";
        System.out.println(myTxt);
        char[] myCh = {'J', 'a', 'v', 'a'};
        //build and print the string
        String myString = new String(myCh);
        System.out.println("... and the new string: \n" + "    " + myString);
    }
}
