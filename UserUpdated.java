package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.*;



@WebServlet("/UserUpdated")
public class UserUpdated extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		out.println("<h2>Employee Updated</h2><hr>");
		HttpSession session=request.getSession();
		out.println("<body bgcolor=cyan>");
		
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		String s3=request.getParameter("t3");
		
		
		session.setAttribute("Employee Number", s1);
		session.setAttribute("Name", s2);
		session.setAttribute("Salary earned", s3);
	
		
		Enumeration<String> names=session.getAttributeNames();
		while(names.hasMoreElements()) {
			String name=names.nextElement();
			String value=session.getAttribute(name).toString();
			out.println(name+" - "+value+"<br>");
		}
		
		Integer n1=Integer.parseInt(s1);
		String n2=String.valueOf(s2);
		Float n3=(float) Integer.parseInt(s3);
		System.out.println(n1+" "+n2+" "+n3);
		 
		try {
			SaveEmp x= new SaveEmp();
			DAO dao = new EmployeeDAO();
			Employee emp=new Employee(n1,n2,(float) n3);
			dao.updateEmp(emp);
			System.out.println("DB saved");
		} catch (Exception e) {
			System.err.println("block  failed");
		}
		
		out.println("</html>");
		out.println("<html>");
		out.println("<form action=admin> <h2>");
		out.println("<input type=submit value=HOME>");
		out.println("</form></html>");
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
