package ecommerce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RemoveProduct")
public class RemoveProduct extends HttpServlet {
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		HibernateClient hbc = new HibernateClient();
		Product product = hbc.get(id);
		
		if(!product.equals(null)) {
			hbc.remove(product);
			hbc.close();
			response.setContentType("text/html");
			response.getWriter().println("<h5> <center>Product Removed Successfully </center></h5>");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/homepage.html");
			rd.include(request, response);
		}else {
			response.setContentType("text/html");
			response.getWriter().println("Error...Please Enter Valid Product Details ");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/homepage.html");
			rd.include(request, response);
		}
		
	}

}
