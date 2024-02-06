package com.devspring;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    
    // public void service(HttpServletRequest req, HttpServletResponse res){
    // public void doPost(HttpServletRequest req, HttpServletResponse res){post method
    public void doGet(HttpServletRequest req, HttpServletResponse res){ // get method
        System.out.println("in Servlets");
        res.setContentType("text/html");
        try {

            res.getWriter().println("Hello World");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
