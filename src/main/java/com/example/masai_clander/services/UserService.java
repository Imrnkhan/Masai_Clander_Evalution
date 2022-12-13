package com.example.masai_clander.services;

import com.example.masai_clander.Model.User;

import java.util.List;

public interface UserService {
    public boolean createUser(User user);

    public User findUserById(Integer id);

    public List<User> findAllUser();

    public boolean deleteUser(Integer id);

    public boolean updateUser(int id);
}
