package week6;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
// Print out each element in the Array and Collection without duplicates
    public class v6Challenge4 {
        public static void main(String[] args) {
            // Create an arraylist
            List<Integer> firstGroupNumbers = new ArrayList<>();
            firstGroupNumbers.add(1);
            firstGroupNumbers.add(4);
            firstGroupNumbers.add(4);
            firstGroupNumbers.add(2);
            firstGroupNumbers.add(6);
            firstGroupNumbers.add(7);

            // Creating an ArrayList from another collection
            List<Integer> firstGroupTenNumbers = new ArrayList<>(firstGroupNumbers);


            List<Integer> nextGroupNumbers = new ArrayList<>();
            nextGroupNumbers.add(2);
            nextGroupNumbers.add(7);
            nextGroupNumbers.add(19);
            nextGroupNumbers.add(23);
            nextGroupNumbers.add(29);

            // Adding an entire collection to an ArrayList
            firstGroupTenNumbers.addAll(nextGroupNumbers);

            System.out.println("The first group numbers: " +firstGroupNumbers);
            System.out.println("The next group numbers: " +nextGroupNumbers);
            System.out.println("The first and the next group numbers together with duplicates: " +firstGroupTenNumbers);
            System.out.println("... and without duplicates: " +firstGroupTenNumbers);

            final List<Integer> listWithoutDuplicates = new ArrayList<>(
                    new LinkedHashSet<>(firstGroupTenNumbers));
            System.out.println("After removing duplicates: "
                    + Arrays.toString(listWithoutDuplicates.toArray()));
        }
    }

