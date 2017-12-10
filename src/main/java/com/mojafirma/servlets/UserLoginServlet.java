package com.mojafirma.servlets;

import com.google.common.base.Strings;
import com.mojafirma.controller.UserController;
import com.mojafirma.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "tweetLogin", value = "/tweetLogin")
public class UserLoginServlet extends HttpServlet {
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
            List<User> usersList = userController.getUserFromDatabaseByNick(authorUser);
            if (usersList.contains(authorUser)) {
                Cookie cookie = new Cookie("userCookie", authorUser);
                String redirectURL = "/tweetTable.jsp";
                resp.sendRedirect(redirectURL);
            } else {
                return;
            }
        }
    }


    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
