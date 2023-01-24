package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 6, urlPatterns = "/28_jan")
public class Sundarnagar extends HttpServlet{
	
	public Sundarnagar() {
		System.out.println("opening Sundarnagar under aptc");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet method in Sundarnagar");
		super.doGet(req, resp);
	}

}
