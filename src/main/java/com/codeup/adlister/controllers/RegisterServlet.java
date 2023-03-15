package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: ensure the submitted information is valid
        String userName = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        boolean invalidInput = userName.isEmpty() || email.isEmpty() || password.isEmpty();

        // TODO: create a new user based off of the submitted information
        if(invalidInput) {
            response.sendRedirect("/register");
            return;
        }
        User user = new User(1, userName, email, password);
        Users dao = DaoFactory.getUsersDao();
        dao.insert(user);

        response.sendRedirect("/login");

        // TODO: if a user was successfully created, send them to their profile
        //I sent them to the login page and then the login page will end up allowing them to log in with their new credentials and send them to their profile.
    }
}
