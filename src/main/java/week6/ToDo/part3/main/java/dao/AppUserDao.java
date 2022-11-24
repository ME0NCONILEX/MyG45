package part3.main.java.dao;

import part3.main.java.model.AppUser;
import part3.main.java.model.Role;

import java.util.List;

public interface AppUserDao {

    AppUser create(AppUser appUser);

    AppUser findById(Integer id);

    boolean deleteById(Integer id);

    void update(AppUser appUser);

    List<AppUser> findAll();

    AppUser findByUsername(String username);

    AppUser findByFirstname(String firstname);

    AppUser findByLastname(String lastname);

    List<AppUser> findByRole(Role role);

}
