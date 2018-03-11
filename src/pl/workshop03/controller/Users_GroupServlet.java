package pl.workshop03.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.workshop03.dao.Users_GroupDao;

/**
 * Servlet implementation class Users_GroupServlet
 */
@WebServlet("/Users_GroupServlet")
public class Users_GroupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Users_GroupServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
