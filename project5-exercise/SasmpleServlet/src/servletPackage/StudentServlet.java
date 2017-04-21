package servletPackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(description = "This is sample servlet", urlPatterns = { "/StudentServlet" })
public class StudentServlet extends HttpServlet implements javax.servlet.Servlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public Student[] students;
	private int counter = 0; 
	public StudentServlet(){
		students[students.length] = new Student("1","aaa");
		counter++;
		students[students.length] = new Student("2","bbb");
		counter++;
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		counter++;
		request.getSession().setAttribute("name", "hello");
		request.getRequestDispatcher("/simplecrud.jsp").forward(request, response);
    }
}
