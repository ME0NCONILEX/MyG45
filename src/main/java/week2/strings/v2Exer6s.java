package week2.strings;
//String - correction
public class v2Exer6s {
    public static void main(String[] args) {
        String myTxt = ("\tJ\ta\tv\ta\t");
        System.out.println("The original sentence is : " + myTxt);
        System.out.println("But if we neat and tiny the sentence: " + myTxt.replace("\t", ""));
    }
}
