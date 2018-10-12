package fujitsu.controller;

import java.awt.print.Book;
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
 * Servlet implementation class UpdateBookServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String designation = request.getParameter("designation");

		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setDesignation(designation);

		EmployeeService service = new EmployeeService();
		service.update(employee);
		List<Employee> empList = service.findAll();
		request.setAttribute("EMPLIST", empList);
		RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
		rd.forward(request, response);

	}

}
