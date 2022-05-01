package ecommerce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EditProduct")
public class EditProduct extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		HibernateClient hbc = new HibernateClient();
		Product product = hbc.get(id);
		
		if(!product.equals(null)) {
			request.setAttribute("product",product);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/ProductInfoAndUpdate.jsp");
			rd.forward(request, response);
		}else {
			response.setContentType("text/html");
			response.getWriter().println("Product data not found");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/homepage.html");
			rd.include(request, response);;
		}

		hbc.close();
		
	}
}
