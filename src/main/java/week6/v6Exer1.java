package week6;
import java.util.List;
import java.util.ArrayList;
// Create a new list and populate it with the days of the week.
//  Lastly, print the out the list.
public class v6Exer1 {
    public static void main(String[] args) {
        List<String> days = new ArrayList<>();
        // List allows you to add duplicate elements
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        System.out.println("List with days of the week : " + days);
    }
}
