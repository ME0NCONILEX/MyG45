package part3.main.java.model;
import java.util.Objects;

public class AppUser {

    private Integer id;
    private String firstname;
    private String lastname;
    private String password;
    private boolean active;
    private Role role;

    public AppUser(Integer id, String firstname, String lastname, String password, boolean active, Role role) {
        setId(id);
        setFirstname(firstname);
        setlastname(lastname);
        setPassword(password);
        setActive(active);
        setRole(role);
    }

 //   public void setLastname(String lastname) {
 //   }

    public AppUser(String firstname, String lastname, String password, Role role) {
        setFirstname(firstname);
        setlastname(lastname);
        setPassword(password);
        setRole(role);
        this.active = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id == null) throw new RuntimeException("id was null");
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if (firstname == null || firstname.length() == 0) throw new IllegalArgumentException("firstname was null");
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        if (lastname == null || lastname.length() == 0) throw new IllegalArgumentException("lastname was null");
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) throw new IllegalArgumentException("password was null");
        if (password.length() < 8) throw new IllegalArgumentException("password length was not valid");
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        if (role == null) role = Role.ROLE_USER;
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return active == appUser.active && Objects.equals(id, appUser.id) && Objects.equals(firstname, appUser.firstname) && Objects.equals(lastname, appUser.lastname) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, active, role);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", active=" + active +
                '}';
    }

}