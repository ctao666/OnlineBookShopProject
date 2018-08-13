package authentication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		System.out.println("Hello from GET method");
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Hello from get ["+request.getParameter("userName")+"]["+request.getParameter("passWord")+"]</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		//writer.println("<h3>Hello from get ["+request.getParameter("userName")+"]["+request.getParameter("passWord")+"]</h3>");
		String user = request.getParameter("userName");
		String pass = request.getParameter("passWord");
		if (getServletConfig().getInitParameter("userNameI").equals(user) && getServletConfig().getInitParameter("passWordI").equals(pass)) {
			response.sendRedirect("success.jsp");
			//writer.println("<h3>Hello from get ["+request.getParameter("userName")+"]["+request.getParameter("passWord")+"]</h3>");
		} else {
			writer.println("<h3> Invalid Login</h3>");
		}
	
	
	}

}


