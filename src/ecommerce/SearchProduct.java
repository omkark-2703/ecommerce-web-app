package ecommerce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SearchProduct")
public class SearchProduct extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		HibernateClient hbc = new HibernateClient();
		Product product = hbc.get(id);
		System.out.println(product);
		if(product != null) {
			List<Product> productList = new ArrayList<Product>();
			productList.add(product);
			request.setAttribute("productList",productList);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/viewAllProduct.jsp");
			rd.forward(request, response);
		}else {
			response.getWriter().println("data not found");
		}

		hbc.close();
		
	}
}
