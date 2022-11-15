package week6;
import java.util.HashSet;
import java.util.Set;
// Create a new hashset and populate it with the days of the week and lastly, print the set out
public class v6Exer5 {
    public static void main(String[] args)
    {
        // Instantiate an object of HashSet
        Set<String> daysOfWeek = new HashSet<>();

        // Add elements using add method
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        System.out.println(daysOfWeek); // For correct days order, see the next exercise (6)
    }
}
