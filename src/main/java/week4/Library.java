package week4;

public class Library {
    public static void main(String[] args) {
        Person person = new Person("Johan", "Strauss", 123);
        Book book1 = new Book("Biography", "Bob Dilan", true);
        Book book2 = new Book("Book2", "Author2", false);
        Book book3 = new Book("Book3", "Author3", true);
        Book book4 = new Book("Book4", "Author4", true);
        Book book5 = new Book("Book5", "Author5", false);

        book1.setBorrower(person);

            {
                System.out.println("Borrower's first Name: " + person.getfirstName());
                System.out.println("Borrower's last Name: " + person.getLastName());
                System.out.println("Borrower's IdNo: " + person.getPersonId());
                System.out.println("Borrowed book title: " + book1.getTitle());
                System.out.println("Borrowed book author: " + book1.getAuthor());
            }

        System.out.println("________________________________\n" + "The library's other books: ");

        System.out.println((book2.getTitle()) + "  " + (book2.getAuthor()) + "\n" + (book3.getTitle())  + "  " + (book3.getAuthor()) + "\n" + (book4.getTitle()) + "  " + (book4.getAuthor()) + "\n" + (book5.getTitle()) + "  " + (book5.getAuthor()));
    }
}