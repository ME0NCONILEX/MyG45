package week6;

import java.util.LinkedList;

public class v6Exer3 {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> days = new LinkedList<>();

        // Adding new elements to the end of the LinkedList using add() method.
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        System.out.println("List with days of the week missing Thursday: " + days);

        // Adding an element at the specified position in the LinkedList
        days.add(3, "Thursday");

        System.out.println("... and, after adding Thursday into the right position : "   + days);

    }
}
