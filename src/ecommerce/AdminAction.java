package ecommerce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/AdminAction")
public class AdminAction extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("adminchoice");
		RequestDispatcher rd;
		switch(action) {
		case "add":
			rd = request.getRequestDispatcher("WEB-INF/AddProduct.jsp");
			break;
		case "remove":
			rd = request.getRequestDispatcher("WEB-INF/RemoveProduct.jsp");
			break;
		case "edit":
			rd = request.getRequestDispatcher("WEB-INF/EditProduct.jsp");
			break;
		case "search":
			rd = request.getRequestDispatcher("WEB-INF/SearchProduct.jsp");
			break;
		case "viewAll":
			rd = request.getRequestDispatcher("ViewAllServlet");
			break;
		default:
			rd = request.getRequestDispatcher("error.jsp");
		}
		
		rd.forward(request, response);
		
	}
}
