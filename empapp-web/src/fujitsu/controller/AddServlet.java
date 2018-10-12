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
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//#1 get values of all parameter from the web page
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String designation = request.getParameter("designation");

		// #2 populating the values to the object
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setDesignation(designation);
		
		// #3 calling the add() method in service
		EmployeeService service = new EmployeeService();
		service.add(employee);

		// #4 calling the findAll() method in service
		List<Employee> empList = service.findAll();
		
		// #5 forwarding the result to jsp/html
		request.setAttribute("EMPLIST", empList);
		RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
		rd.forward(request, response);
	}

}











