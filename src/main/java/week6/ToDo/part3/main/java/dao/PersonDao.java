package part3.main.java.dao;
import part3.main.java.Model.Person;
import java.util.List;
import java.util.Optional;

public interface PersonDao  {
    Person create(Person model);
    Person findById(Integer id);
    boolean deleteById(Integer id);
    void update(Person model);
    List<Person> findAll();
    Optional<Person> findByUsername(String username);
}
