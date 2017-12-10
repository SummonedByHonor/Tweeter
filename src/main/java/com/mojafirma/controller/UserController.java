package com.mojafirma.controller;

import com.mojafirma.model.User;
import com.mojafirma.model.modelDAO.UserDAO;

import java.util.List;

public class UserController {

    UserDAO userDAO = new UserDAO();

    public void addUserToDatabase(User user){
        userDAO.addUser(user);
    }

    public void getUserFromDatabase(int index){
        userDAO.getUser(index);
    }

    public List<User> getUserFromDatabaseByNick (String nick){
         return userDAO.getUserByNick(nick);
    }
}
