package fujitsu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fujitsu.empapp.model.Employee;
import fujitsu.empapp.service.EmployeeService;

/**
 * Servlet implementation class DeleteBookServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		EmployeeService service = new EmployeeService();
		service.delete(id);

		List<Employee> empList = service.findAll();

		request.setAttribute("EMPLIST", empList);
		RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
		rd.forward(request, response);

	}

}
