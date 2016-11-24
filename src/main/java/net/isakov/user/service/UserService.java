package net.isakov.user.service;

import net.isakov.user.model.User;

import java.util.List;

/**
 * Created by user on 23.11.2016.
 */
public interface UserService {
    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(int id);

    public User getUserById(int id);

    public List<User> listUsers();
}
