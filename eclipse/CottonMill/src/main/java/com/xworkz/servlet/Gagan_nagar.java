package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 7, urlPatterns = "/29_jan")
public class Gagan_nagar extends HttpServlet{
	
	public Gagan_nagar() {
		System.out.println("opening Gagan_nagar under aptc");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet method in Gagan_nagar");
		super.doGet(req, resp);
	}

}
