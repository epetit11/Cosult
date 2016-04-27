import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/communes")
public class CommunesServlet extends HttpServlet{

	public void doGet( HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String codePostal = request.getParameter("code_postal");
		request.setAttribute("codePostal", codePostal);
		this.getServletContext().getRequestDispatcher("/communes.jsp").forward(request, response);
	}
}
