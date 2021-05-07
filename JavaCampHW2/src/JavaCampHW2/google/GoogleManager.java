package JavaCampHW2.google;

import JavaCampHW2.business.abstracts.UserService;
import JavaCampHW2.entities.concretes.User;

import java.util.ArrayList;

public class GoogleManager implements GoogleService {



    @Override
    public void loginWithGoogle(String email, String password) {
       System.out.println("Google ile girildi.");
    }
}
