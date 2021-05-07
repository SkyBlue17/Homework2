package JavaCampHW2;

import JavaCampHW2.business.abstracts.UserService;
import JavaCampHW2.business.concretes.UserManager;
import JavaCampHW2.core.GoogleLoginManager;
import JavaCampHW2.core.LoginService;
import JavaCampHW2.dataAccess.concretes.AbcUserDao;
import JavaCampHW2.entities.concretes.User;

public class Main {



    public static void main(String[] args) {
        UserService userService = new UserManager(new AbcUserDao());
        LoginService loginService = new GoogleLoginManager();
        User user1 = new User(1,"Burak","Güner","burakgunertr3@gmail.com","1234567");
        User user2 = new User(2,"Engin","Demiroğ","engin.com","10254555");
        User user3 = new User(3,"Batuhan","Güner","batuhan@gmail.com","12000000");
        User user4 = new User(4,"Taner","Güner","batuhan@gmail.com","1234567");
        User user5 = new User(4,"Taner","Güner","batuhan@gmail.com","1234567");
        User user6 = new User(5,"Burak","Güner","burakgunertr3@gmail.com","1234567");


        userService.register(user1);
        userService.login("burakgunertr3@gmail.com","1234567");
        userService.login("batuhan@gmail.com","10254555");
        userService.loginWithGoogle(user1);








    }
}
