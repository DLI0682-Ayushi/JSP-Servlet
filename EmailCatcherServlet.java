package com.godigit.webapp.controller;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/EmailCatcherServlet")
public class EmailCatcherServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String userEmail = request.getParameter("userEmail");
        out.println("<html><body><h1>Your Email: " + userEmail + "</h1></body></html>");
        out.close();
    }
}
