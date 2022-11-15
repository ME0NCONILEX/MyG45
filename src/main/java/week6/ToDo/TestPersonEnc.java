package week6.Todo;

public class TestPersonEnc {
        public static void main(String[] args) {
            //creating instance of Account class
            // Person acc=new Person();
            //setting values through setter methods
            Person person = new Person("Nisse", "Olsson", "nisse@gmail.com", 123);
            //getting values through getter methods
            System.out.println(person.getPersonId()+" "+person.getfirstName()+" "+person.getLastName()+" "+person.getEmail());
        }
    }
