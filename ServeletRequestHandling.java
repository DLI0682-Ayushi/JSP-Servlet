package com.godigit.webapp.controller;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/GreetingServlet")
public class  ServeletRequestHandling extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String userName = request.getParameter("userName");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("Hello, " + userName + "!");
        out.close();
    }
}
