package week6;

import java.util.LinkedList;

// New list out of the first three elements of the first list using a subList.
public class v6Exer4 {
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

        System.out.println("List with days of the week : " + days + "\n" + "... and a subList of the last four days: ");

        for (String str : days.subList(4, 7)) {
            System.out.println(str);
        }
    }
}
