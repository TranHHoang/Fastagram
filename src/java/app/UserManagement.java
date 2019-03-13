package app;

import dao.DatabaseDao;
import java.util.List;
import models.User;

public class UserManagement {

    DatabaseDao dao;

    public UserManagement(DatabaseDao dao) {
        this.dao = dao;
    }

    public List<User> getUsers() {
        return dao.getAllUser();
    }

    public User getUserByName(String name) {
        return dao.getUserByName(name);
    }

    public void addUser(User u) {
        dao.addUser(u);
    }

    public void editUserByName(User user) {
        dao.editUserByName(user);
    }
}
