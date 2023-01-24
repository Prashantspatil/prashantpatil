package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 5, urlPatterns = "/25_jan")
public class Prakashnagar extends HttpServlet{
	
	public Prakashnagar() {
		System.out.println("opening Prakashnagar under aptc");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet method in Prakashnagar");
		super.doGet(req, resp);
	}

}
