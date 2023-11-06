package com.trail.loginServlet;

import java.io.IOException;

	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class LoginServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");

	        // Perform login authentication using DatabaseUtil methods

	        // If login is successful, redirect to DownloadServlet
	        response.sendRedirect("download");

	        // Otherwise, redirect to register.html
	        response.sendRedirect("register.html");
	    }
	}
