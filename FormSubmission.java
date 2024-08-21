package com.godigit.webapp.controller;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/EmailAgeServlet")
public class FormSubmission extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String userEmail = request.getParameter("userEmail");
        String userAge = request.getParameter("userAge");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Email: " + userEmail + "</h1>");
        out.println("<h1>Age: " + userAge + "</h1>");
        out.println("</body></html>");
        out.close();

    }
}
