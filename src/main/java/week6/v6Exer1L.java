package week6;
import java.util.LinkedList;
// Create a new list and populate it with the days of the week.
//  Lastly, print the out the list.
public class v6Exer1L {

    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> days = new LinkedList<>();

        // Adding new elements to the end of the LinkedList using add() method.
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
