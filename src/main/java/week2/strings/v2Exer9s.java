package week2.strings;
//String manipulate and convert/store to array with split
public class v2Exer9s {
    public static void main(String[] args) {
        String myTxt = "Carl, Susie, Fredrik, Bob, Erik";
        System.out.println("The initial sentence: \n" + myTxt +"\n");
        //spliting the sentence
        String[] myArr = myTxt.split(",");
        System.out.println("split in an Array");
        for (String mySpl: myArr)
            System.out.println(mySpl);
    }
}
