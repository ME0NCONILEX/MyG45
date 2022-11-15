package week6;
import java.util.*;
// Set bulk operations
public class v6Challenge1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Monday");
        set.add("Tuesday");
        set.add("Wednesday");
        set.add("Thursday");
        set.add("Friday");
        set.add("Saturday");
        set.add("Sunday");

        System.out.println("All week's days -- > " + set);

        Set<String> secondset = new HashSet<>();
        secondset.add("Saturday");
        secondset.add("Sunday");
        System.out.println("Only weekend days -- > " + secondset);

        System.out.println("addAll -- > " + secondset.addAll(set));
        System.out.println(secondset);
        System.out.println("retainAll -- > " + secondset.retainAll(set));
        System.out.println(" " );
    }
}