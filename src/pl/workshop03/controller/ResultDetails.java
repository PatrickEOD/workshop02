package pl.workshop03.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.workshop03.dao.SolutionsDao;
import pl.workshop03.model.Solutions;

/**
 * Servlet implementation class ResultDetails
 */
@WebServlet("/ResultDetails")
public class ResultDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ResultDetails() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Solutions solution = SolutionsDao.loadById(Integer.parseInt(request.getParameter("id")));
		
		request.setAttribute("solution", solution);
		getServletContext().getRequestDispatcher("/WEB-INF/showDetails.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
