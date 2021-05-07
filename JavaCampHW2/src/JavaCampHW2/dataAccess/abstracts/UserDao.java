package JavaCampHW2.dataAccess.abstracts;

import JavaCampHW2.entities.concretes.User;

public interface UserDao {
    void add(User user);
    void delete(User user);
    void update(User user);
}
