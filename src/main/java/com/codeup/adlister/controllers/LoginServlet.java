package com.codeup.adlister.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            System.out.format("doGet1 in LoginServlet");
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
//        if (username != null && username.equals("admin") && password != null && password.equals("password")) {
//            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
//            return;
//        } else {
//            response.sendRedirect("/login");
//        }

        // TODO: find a record in your database that matches the submitted password
        // TODO: make sure we find a user with that username
        // TODO: check the submitted password against what you have in your database


        if (username != null && username.equals("admin") && password != null && password.equals("password")) {
            // TODO: store the logged in user object in the session, instead of just the username
            request.getSession().setAttribute("user", username);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}
