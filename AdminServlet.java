package servlets;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.io.*;

@WebServlet("/admin")

	public class AdminServlet extends HttpServlet {



		public void service (HttpServletRequest request, HttpServletResponse response) throws IOException {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			out.println("<html><body bgcolor=#5a1641 text=white>");
			out.println("Hello, "+request.getParameter("uid"));
			out.println(request.getParameter("pwd"));
			
			out.println("<form action=SaveEmp> <h2>");
			out.println("<input type=submit value=CreateUser>");
			out.println("</form>");
			out.println("<hr>");
			
			out.println("<form action=UpdateEmp> <h2>");
			out.println("<input type=submit value=UpdateUser>");
			out.println("</form>");
			out.println("<hr>");
		
			out.println("<form action=DeleteEmp> <h2>");
			out.println("<input type=submit value=DeleteUser>");
			out.println("</form>");
			
			out.println("<hr></body></html>");
		}


}
