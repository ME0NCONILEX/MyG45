package week4;

public class Person {
    private String firstName;
    private String lastName;
    private int personId;

    //   public String Person() {

    public Person(String firstName, String lastName, int personId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personId = personId;
    }

    //   public Person(String Bob, String Dilan, int personId) { }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}
