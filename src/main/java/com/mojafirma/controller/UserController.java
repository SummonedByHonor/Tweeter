package com.mojafirma.controller;

import com.mojafirma.model.User;
import com.mojafirma.model.modelDAO.UserDAO;

public class UserController {

    UserDAO userDAO = new UserDAO();

    public void addUserToDatabase(User user){
        userDAO.addUser(user);
    }

    public void getUserFromDatabase(int index){
        userDAO.getUser(index);
    }
}
