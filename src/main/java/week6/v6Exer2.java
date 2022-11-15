package week6;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
// Create a new list and populate it with the days of the week.
//  Lastly, print the out the list both forward and backward.
public class v6Exer2 {
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

        System.out.println("List with days of the week : " + days + "\n" +" ... and each day printed separately forwards: ");

        ListIterator<String> listIterator = days.listIterator(days.size());
        while (listIterator.hasNext()) {
            String day = listIterator.next();
            System.out.println(day);
        }

        for (String s : days) {
            System.out.println(s);

        }
        System.out.println("... and backwards if you wish... :");
        // And here, we start from the end of the list and traverse backwards.
        while (listIterator.hasPrevious()) {
            String day = listIterator.previous();
            System.out.println(day);
        }
    }
}