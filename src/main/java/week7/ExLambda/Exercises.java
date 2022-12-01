package week7.ExLambda;

import week7.ExLambda.data.DataStorage;
import week7.ExLambda.model.Gender;
import week7.JavaUtilFunc.tutor.UtilFunc.Model.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.Objects;

public class Exercises {

    private final static DataStorage storage = DataStorage.INSTANCE;

    /*
       1.	Find everyone that has firstName: “Erik” using findMany().
    */
    public static void exercise1(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise1
        storage.findMany(p-> p.getFirstName().equals("Erik") ).forEach(System.out::println);
        System.out.println("----------------------");

    }

    private static boolean findMany(String erik) {
        return false;
    }


    /*
        2.	Find all females in the collection using findMany().
     */
    public static void exercise2(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise2
        storage.findMany(person -> Objects.equals(person.getGender(), Gender.FEMALE)).forEach(System.out::println);
        System.out.println("----------------------");
    }

    /*
        3.	Find all who are born after (and including) 2000-01-01 using findMany().
     */
    public static void exercise3(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise3
        storage.findMany(person -> person.getBirthDate().isAfter(LocalDate.parse("1999-12-31"))).forEach(System.out::println);
        System.out.println("----------------------");
    }

    /*
        4.	Find the Person that has an id of 123 using findOne().
     */
    public static void exercise4(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise4
        System.out.println(storage.findOne(p -> p.getId() == 123));
        System.out.println("----------------------");

    }

    /*
        5.	Find the Person that has an id of 456 and convert to String with following content:
            “Name: Nisse Nilsson born 1999-09-09”. Use findOneAndMapToString().
     */
    public static void exercise5(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise5
        System.out.println("----------------------");
        System.out.println(
                storage.findOneAndMapToString(
                        person -> person.getId() == 456,
                        person -> "Name: " + person.getFirstName() + " " + person.getLastName() + " born " + person.getBirthDate()
                )
        );
    }

    /*
        6.	Find all male people whose names start with “E” and convert each to a String using findManyAndMapEachToString().
     */
    public static void exercise6(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise6

        storage.findManyAndMapEachToString(
                person -> Period.between(person.getBirthDate(), LocalDate.now()).getYears() < 10,
                person -> person.getFirstName() + " " + person.getLastName() + " " + Period.between(person.getBirthDate(), LocalDate.now()).getYears() + " years"
        ).forEach(System.out::println);
        System.out.println("----------------------");
    }

    /*
        7.	Find all people who are below age of 10 and convert them to a String like this:
            “Olle Svensson 9 years”. Use findManyAndMapEachToString() method.
     */
    public static void exercise7(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise7
        storage.findManyAndMapEachToString(
                person -> Period.between(person.getBirthDate(), LocalDate.now()).getYears() < 10,
                person -> person.getFirstName() + " " + person.getLastName() + " " + Period.between(person.getBirthDate(), LocalDate.now()).getYears() + " years"
        ).forEach(System.out::println);
        System.out.println("----------------------");
    }

    /*
        8.	Using findAndDo() print out all people with firstName “Ulf”.
     */
    public static void exercise8(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise8
        storage.findAndDo(
                person -> person.getFirstName().equals("Ulf"),
                System.out::println
        );
        System.out.println("----------------------");
    }

    /*
        9.	Using findAndDo() print out everyone who have their lastName contain their firstName.
     */
    public static void exercise9(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise9
        storage.findAndDo(
                person -> person.getLastName().toLowerCase().contains(person.getFirstName().toLowerCase()),
                System.out::println
        );
        System.out.println("----------------------");
    }

    /*
        10.	Using findAndDo() print out the firstName and lastName of everyone whose firstName is a palindrome.
     */
    public static void exercise10(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise10
        storage.findAndDo(
                person -> person.getFirstName().equalsIgnoreCase(new StringBuilder(person.getFirstName()).reverse().toString()),
                person -> System.out.println(person.getFirstName() + " " + person.getLastName())
        );
        System.out.println("----------------------");
    }

    /*
        11.	Using findAndSort() find everyone whose firstName starts with A sorted by birthdate.
     */
    public static void exercise11(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise11
        for (week7.ExLambda.model.Person person1 : storage.findAndSort(
                person -> person.getBirthDate().getYear() < 1950,
                Comparator.comparing(Person::getBirthDate).reversed()
        )) {
            System.out.println(person1);
        }

        System.out.println("----------------------");
    }

    /*
        12.	Using findAndSort() find everyone born before 1950 sorted reversed by lastest to earliest.
     */
    public static void exercise12(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise12
        storage.findAndSort(
                person -> person.getBirthDate().getYear() < 1950,
                Comparator.comparing(Person::getBirthDate).reversed()
        ).forEach(System.out::println);

        System.out.println("----------------------");
    }

    /*
        13.	Using findAndSort() find everyone sorted in following order: lastName > firstName > birthDate.
     */
    public static void exercise13(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise13
        //With Anonymous inner Class
        Comparator<Person> compareLastName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        };

        //With Lambda
        Comparator<Person> compareFirstName = (Person o1, Person o2) -> o1.getFirstName().compareTo(o2.getFirstName());

        //With Method Reference
        Comparator<Person> compareBirthDate = Comparator.comparing(Person::getBirthDate);

        //Stack
        Comparator<Person> all = compareLastName.thenComparing(compareFirstName).thenComparing(compareBirthDate);

        storage.findAndSort(all).forEach(System.out::println);


        /*
        storage.findAndSort(
                Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName).thenComparing(Person::getBirthDate)
        ).forEach(System.out::println);
        */

        System.out.println("----------------------");
    }
}
