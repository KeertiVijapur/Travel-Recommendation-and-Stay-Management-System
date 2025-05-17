package com.tourism.tourismrecommenderproject.controller;

import com.tourism.tourismrecommenderproject.model.User;
import com.tourism.tourismrecommenderproject.service.RecommenderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/WebController")
public class WebController extends HttpServlet {
    private RecommenderService recommenderService;

    @Override
    public void init() throws ServletException {
        recommenderService = new RecommenderService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User(username, email, password);
        try {
            recommenderService.registerUser(user);
        } catch (SQLException e) {
            throw new ServletException("Database error during user registration", e);
        }

        response.sendRedirect("login.jsp");
    }
}
