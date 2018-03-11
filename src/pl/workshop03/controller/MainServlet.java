package pl.workshop03.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.workshop03.dao.SolutionsDao;
import pl.workshop03.model.Solutions;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MainServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String limitString = getServletContext().getInitParameter("number-solutions");
		Integer limit = Integer.valueOf(limitString);
		
		List<Solutions> list = SolutionsDao.loadAll(limit); 
//		response.getWriter().append(list.size() + " record has been downloaded!");
		request.setAttribute("solutions", list);
		getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
