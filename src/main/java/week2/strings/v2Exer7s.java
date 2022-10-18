package week2.strings;
//String convert integer <--> String
public class v2Exer7s {
    public static void main(String[] args){
        String myStrTst = "20";
        int myInt = 20;
        int iTest = Integer.parseInt(myStrTst);
        System.out.println("Initial integer: " + (myInt));
        System.out.println("The final String - concatenation btw converted integer and string: " + " ");
        System.out.println(myStrTst.concat(String.valueOf(iTest)));
    }
}
