package jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/vicky")
public class MsgUsingJspServlet extends HttpServlet {
	public MsgUsingJspServlet() {
		System.out.println("Creating MsgUsingJspServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service do post");
		String from = req.getParameter("from");
		String to = req.getParameter("to");
		String message = req.getParameter("message");

		resp.getWriter().print(from+to+message);
		
		RequestDispatcher dispatcher =	req.getRequestDispatcher("message.jsp");
		req.setAttribute("from", from);
		req.setAttribute("to", to);
		req.setAttribute("message", message);
		dispatcher.forward(req, resp);
	}
}
