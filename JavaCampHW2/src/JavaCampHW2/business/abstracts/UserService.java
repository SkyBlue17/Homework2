package JavaCampHW2.business.abstracts;

import JavaCampHW2.entities.concretes.User;

public interface UserService {
    void login(String email , String password);
    void register(User user);
    void loginWithGoogle(User user);
}
