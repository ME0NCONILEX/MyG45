package part3.main.java.dao.impl;

import part3.main.java.dao.impl.sequencer.PersonIdSequencer;
import part3.main.java.model.Role;
import part3.main.java.dao.AppUserDao;
import part3.main.java.model.AppUser;

import java.util.ArrayList;
import java.util.List;

public abstract class AppUserDaoImpl implements AppUserDao {

    private List<AppUser> storage;

    private static AppUserDaoImpl instance;

    private AppUserDaoImpl() {
        storage = new ArrayList<>();
    }

    public static AppUserDaoImpl getInstance(){
        if (instance == null) instance = new AppUserDaoImpl() {
            @Override
            public AppUser findByUsername(String username) {
                return null;
            }
        };
        return instance;
    }

    @Override
    public AppUser create(AppUser appUser) {
        if (appUser == null) throw new IllegalArgumentException("appUser was null");
        // check -> the username must not be duplicate
        appUser.setId(PersonIdSequencer.nextId());
        storage.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findById(Integer id) {
        if (id == null) throw new IllegalArgumentException("id was null");
        for (AppUser appUser : storage)
            if (appUser.getId().equals(id)) return appUser;

        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        AppUser result = findById(id);
        return storage.remove(result);
    }

    @Override
    public void update(AppUser toUpdate) {
        if (toUpdate == null) throw new IllegalArgumentException("toUpdate data was null");
        for (AppUser original : storage) {
            if (original.getId().equals(toUpdate.getId())) {
                original.setFirstname(toUpdate.getFirstname());
                original.setlastname(toUpdate.getLastname());
                original.setPassword(toUpdate.getPassword());
                original.setRole(toUpdate.getRole());
                original.setActive(toUpdate.isActive());
                break;
            }
        }

    }

    @Override
    public List<AppUser> findAll() {
        return new ArrayList<>(storage);
    }



    @Override
    public AppUser findByFirstname(String firstname) {
        if (firstname == null) throw new IllegalArgumentException("firstname was null");
        for (AppUser appUser : storage)
            if (appUser.getFirstname().equals(firstname)) return appUser;
        return null;
    }

    @Override
    public AppUser findByLastname(String lastname) {
        if (lastname == null) throw new IllegalArgumentException("lastname was null");
        for (AppUser appUser : storage)
            if (appUser.getLastname().equals(lastname)) return appUser;
        AppUser appUser = null;
        if (appUser.getLastname().equals(lastname)) return appUser;
        return null;
    }

    @Override
    public List<AppUser> findByRole(Role role) {
        if (role == null) throw new IllegalArgumentException("role was null");
        List<AppUser> filteredList = new ArrayList<>();
        for(AppUser appUser: storage){
            if (appUser.getRole() == role){
                filteredList.add(appUser);
            }
        }

        return filteredList;
    }
}
