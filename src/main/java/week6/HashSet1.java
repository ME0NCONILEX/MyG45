package week6;
import java.util.*;
class HashSet1{
    public static void main(String[] args){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        for (String s : set) {
            System.out.println(s);
        }
    }
}