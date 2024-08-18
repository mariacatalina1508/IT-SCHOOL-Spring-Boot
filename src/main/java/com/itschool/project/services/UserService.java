package com.itschool.project.services;

import com.itschool.project.models.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    List<User>getUsers();
}