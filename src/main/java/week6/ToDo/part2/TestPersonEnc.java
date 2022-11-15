package week6.Todo.part2;
import java.time.LocalDate;
public class TestPersonEnc {
    public static void main(String[] args) {
        Person nisse = new Person("Nisse", "Olsson", "nisse@gmail.com");
        Person essin = new Person("Essin", "Nosslo", "essin@gmail.com");

        System.out.println("********* \n" + "* Users *\n" + "********* \n" + nisse.toString() + "\n" + essin +"\n");
        TodoItem item1 = new TodoItem("Studies", "apply the mind to learn and undertand OOP in Java 8", LocalDate.of(2022, 11, 20), false, nisse);

        TodoItemTask itemTask = new TodoItemTask(true, item1, essin);
        System.out.println(itemTask.getTodoItem().toString() + "\n");

        AppUser appUser = new AppUser("My New Name", "3210emaNweN", AppRole.ROLE_APP_USER);
        AppUser appUser1 = new AppUser("Essin Nosslo", "Essin0123", AppRole.ROLE_APP_USER);
        System.out.println(appUser.toString());
        System.out.println("Are the AppUser2 the same AppUser1? --> " +  appUser.equals(appUser1));
        System.out.println("AppUser's hashcode: " + appUser.hashCode());
    }
}
