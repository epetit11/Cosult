import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


@WebServlet("/communes")
public class CommunesServlet extends HttpServlet{

	public void doGet( HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String codePostal = request.getParameter("code_postal");
		request.setAttribute("codePostal", codePostal);
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projetjee", "root", "");
		Statement stmt = con.createStatement();
		String query = "SELECT * FROM resultats";
		ResultSet rs = stmt.executeQuery(query);
		}
		catch (SQLException e)
		{
			request.setAttribute("codePostal", "err : " + e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getServletContext().getRequestDispatcher("/communes.jsp").forward(request, response);
	}
}
	