package ecommerce;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// AUTHETICATE USER 
		
		// check username and password in database 
		// Currently there is one user present in table called "user" 
		// Username - Omkar 
		//password- omkar123
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(username, password);
		
		HibernateClient hbc = new HibernateClient();
	
		if(hbc.contains(user)) {
			// show homepage
			hbc.close();
			response.getWriter().println("Hello "+user.getUsername());
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/homepage.html");
			rd.forward(request, response);
			
		}
		else {
			// invalid username or password..redirect to login page
			hbc.close();
			response.setContentType("text/html");  
			PrintWriter out =response.getWriter();
			out.println("Invalid User details...\nPlease Try Again ");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);

		}
		
	}

}
