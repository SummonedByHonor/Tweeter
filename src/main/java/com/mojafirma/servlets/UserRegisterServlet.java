package com.mojafirma.servlets;

import com.google.common.base.Strings;
import com.mojafirma.controller.UserController;
import com.mojafirma.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "userRegister", value = "/userRegister")
public class UserRegisterServlet extends HttpServlet {
    UserController userController = new UserController();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset = utf-8");
        String authorUser = req.getParameter("user");
        String authorUserPassword = req.getParameter("password");

        if (Strings.isNullOrEmpty(authorUser) || Strings.isNullOrEmpty(authorUserPassword)) {
            return;
        } else {
            User user = new User();
            user.setUserName(authorUser);
            user.setUserPassword(authorUserPassword);
            userController.addUserToDatabase(user);
        }

        super.doPost(req, resp);
    }
}
