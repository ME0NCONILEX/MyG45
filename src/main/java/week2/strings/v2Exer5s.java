package week2.strings;
//String - correction
public class v2Exer5s {
    public static void main(String[] args) {
        String myTxt = ("Java is the worst programming language!");
        System.out.println("The original stupid sentence is : " + myTxt);
        System.out.println("But let us to see the truth: " + myTxt.replace("worst", "best"));
    }
}
