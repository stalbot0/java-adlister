//package com.codeup.adlister.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/ads/create.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Ad ad = new Ad(
                1, // for now we'll hardcode the user id
                request.getParameter("title"),
                request.getParameter("description"),
                request.getParameter("price"),
                request.getParameter("user_id")
        );
        ListAdsDaoFactory.getAdsDao().insert(ad);
        response.sendRedirect("/ads");
    }
}
