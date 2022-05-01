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
@WebServlet("/ViewAllServlet")
public class ViewAllServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HibernateClient hbc = new HibernateClient();
		ArrayList<Product> list = hbc.getAll();
		hbc.close();
		request.setAttribute("productList", list);
		request.getRequestDispatcher("WEB-INF/viewAllProduct.jsp").forward(request, response);
	}
}
