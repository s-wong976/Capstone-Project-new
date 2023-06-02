package com.example.capstoneproject.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet", value = "/register-servlet")

public class RegisterServlet extends HttpServlet {
    public static final long serialVersionUID = 1L;

    //see HTTP Servlet()
    public RegisterServlet(){
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.getWriter().append("User").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response);
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // will eventually connect into database but for now can print to the screen
        out.println("");
        out.println(" A user account has been created with the following credentials:");
        out.println("Name: " + name);
        out.println("Email: " + email);
        out.println("Password:" + password);
    }

}
