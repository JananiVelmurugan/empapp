package fujitsu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fujitsu.empapp.model.Employee;
import fujitsu.empapp.service.EmployeeService;

/**
 * Servlet implementation class EditBookServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
	
		EmployeeService service = new EmployeeService();
		Employee employee = service.findById(id);

		request.setAttribute("EMPLOYEE", employee);
		RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
		rd.forward(request, response);

	}

}
