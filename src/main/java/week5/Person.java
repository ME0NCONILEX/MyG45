package week5;

public class Person {
        private int personId;
        private String firstName;
        private String lastName;

        private String email;

        //   public String Person() {

        public Person(String firstName, String lastName, String email, int personId) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.personId = personId;
            this.email = email;
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

        public String getEmail() {
        return email;
        }

        public void setEmail(String email) {
        this.email = email;
    }

}

