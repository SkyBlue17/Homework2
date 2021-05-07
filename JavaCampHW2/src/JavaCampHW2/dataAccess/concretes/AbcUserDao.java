package JavaCampHW2.dataAccess.concretes;

import JavaCampHW2.dataAccess.abstracts.UserDao;
import JavaCampHW2.entities.concretes.User;

public class AbcUserDao implements UserDao{

    @Override
    public void add(User user) {
        System.out.println("Abc veritabanına şu kullanıcı eklendi : " + user.getFirstName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Abc veritabanından şu kullanıcı silindi : " + user.getFirstName());
    }

    @Override
    public void update(User user) {
        System.out.println("Veritabanı güncellendi." );

    }
}

