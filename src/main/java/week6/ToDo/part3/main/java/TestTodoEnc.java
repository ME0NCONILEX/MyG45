package part3.main.java;

import part3.main.java.dao.AppUserDao;
import part3.main.java.dao.impl.AppUserDaoImpl;
import part3.main.java.model.AppUser;
import part3.main.java.model.Role;

public class TestTodoEnc {

    public static void main(String[] args) {
        // user data
        AppUser appUserData1 = new AppUser("Nisse", "Olsson", "A1b3Cd#1qse5", Role.ROLE_USER);
        AppUser appUserData2 = new AppUser("essin", "Nosslo", "D3cB1acgy89k", Role.ROLE_USER);
        AppUser appUserData3 = new AppUser("Jorgen", "Bergren", "N0Pswrd1dr56ji", Role.ROLE_USER);
        AppUser appUserData4 = new AppUser("4first", "4last", "xr6jk1rwsP0N", Role.ROLE_USER);

        AppUserDao appUserDao = AppUserDaoImpl.getInstance();
        AppUser createdAppUser1 = appUserDao.create(appUserData1);
        AppUser createdAppUser2 = appUserDao.create(appUserData2);
        AppUser createdAppUser3 = appUserDao.create(appUserData3);
        AppUser createdAppUser4 = appUserDao.create(appUserData4);


        System.out.println("-------------------");
        System.out.println(appUserDao.findAll());
        System.out.println("-------------------");

        AppUser updateAppUser101 = new AppUser(101, "firstname", "lastname", "password", false, Role.ROLE_USER);
        AppUser updateAppUser102 = new AppUser(102, "firstname", "lastname",  "password", false, Role.ROLE_USER);
        appUserDao.update(updateAppUser101);
        AppUser findById102 = appUserDao.findById(102);
        System.out.println(findById102);
        AppUser findById103 = appUserDao.findById(103);
        System.out.println(findById103);
        AppUser findById104 = appUserDao.findById(104);
        System.out.println(findById104);
        AppUser findById105 = appUserDao.findById(105);
        System.out.println(findById105);

 //       AppUserDao appUserDao2 = AppUserDaoImpl.getInstance();
 //       System.out.println(appUserDao2.findAll());


    }

}