package JavaCampHW2.business.concretes;

import JavaCampHW2.business.abstracts.UserService;
import JavaCampHW2.core.LoginService;
import JavaCampHW2.dataAccess.abstracts.UserDao;
import JavaCampHW2.entities.concretes.User;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserManager implements UserService {
    UserDao userDao;
    LoginService loginService;
    ArrayList<String> userList = new ArrayList<String>();

    public UserManager(UserDao userDao, LoginService loginService, ArrayList<String> userList) {
        super();
        this.userDao = userDao;
        this.loginService = loginService;
        this.userList = userList;
    }



    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }


    public static boolean isEmailValid(String email){
        Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
        return EMAIL_REGEX.matcher(email).matches();
    }



    @Override
    public void login(String email, String password) {
        if (userList.contains(email) && userList.contains(password)){
            System.out.println("Sisteme giriş başarılı");
        }
        else{
            System.out.println("Kullanıcı bulunamadı lütfen hesap oluşturunuz.");
        }


    }

    @Override
    public void register(User user) {
        if (user.getPassword().length()<6){
            System.out.println("Parolanız 6 karakterden uzun olmalıdır.");
            return;
        }
        if (userList.contains(user.getEmail())){
            System.out.println("Bu email daha önce kullanılmış. Lütfen başka email ile kayıt olunuz.");

        }
        if (user.getFirstName().length()<2 || user.getLastName().length()<2){
            System.out.println("Adınız ve soyadınız iki karakterden uzun olmalıdır");
            return;
        }
        if (isEmailValid(user.getEmail()) != true){
            System.out.println("Lütfen geçerli bir email adresi giriniz.");
            return;
        }
        else {
            System.out.println("Kayıt başarılı.");
            userDao.add(user);
            userList.add(user.getEmail());
            userList.add(user.getPassword());


        }

    }

    @Override
    public void loginWithGoogle(User user) {
    loginService.loginSystem(user.getEmail(),user.getPassword());


    }


}
