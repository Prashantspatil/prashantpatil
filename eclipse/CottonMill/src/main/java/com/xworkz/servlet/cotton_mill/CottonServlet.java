package com.xworkz.servlet.cotton_mill;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/26_jan")
public class CottonServlet extends HttpServlet {
	
	public CottonServlet() {
		System.out.println("opening cotton_mill under aptc");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet method in CottonServlet");
		super.doGet(req, resp);
	}

}
