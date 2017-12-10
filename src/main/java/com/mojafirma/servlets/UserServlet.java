package com.mojafirma.servlets;

import com.google.common.base.Strings;
import com.mojafirma.controller.UserController;
import com.mojafirma.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    UserController userController = new UserController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset = utf-8");
        super.doGet(req, resp);
    }

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
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
