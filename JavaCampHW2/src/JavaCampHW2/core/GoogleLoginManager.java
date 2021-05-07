package JavaCampHW2.core;

import JavaCampHW2.business.concretes.UserManager;
import JavaCampHW2.entities.concretes.User;
import JavaCampHW2.google.GoogleManager;
import JavaCampHW2.google.GoogleService;

public class GoogleLoginManager implements LoginService{


    @Override
    public void loginSystem(String email, String password) {
        GoogleService googleService = new GoogleManager();
        googleService.loginWithGoogle(email,password);
    }
}







