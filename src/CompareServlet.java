import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Code;
import model.Projet;

@WebServlet("/compare")
public class CompareServlet extends HttpServlet  {
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) 
			 throws ServletException, IOException {
		
		List<Projet> projectsOfOwner = new LinkedList<Projet>();
		 Projet pro = null;
		
		 String codeInsee=request.getParameter("codeInsee");
		 System.out.println("le code insee est "+codeInsee);
		 
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver OK");
				
				String url="jdbc:mysql://localhost/test";
				String user="root";
				String passwordBdd="";
				
				
				Connection connection =  DriverManager.getConnection(url,user,passwordBdd);
				System.out.println("Connexion effective");
				
				
				//STATEMENT
				PreparedStatement state =connection.prepareStatement("SELECT * FROM liste WHERE Commune=?");
				state.setString( 1, codeInsee );
				
				ResultSet result=state.executeQuery();
				
				
				
				//System.out.println("le code insee est "+codeInsee);
				
				
				while(result.next())
				{
					 pro = new Projet( result.getString("Ville"), result.getString("Commune"), result.getString("Etablissement"), result.getString("serieL"), result.getString("serieES"), result.getString("serieS"),result.getString("serieSTMG"),result.getString("serieSTI2D"),result.getString("serieSTD2A"),result.getString("serieSTL"),result.getString("serieST2S"),result.getString("serieMusiqDanse"),result.getString("serieHotellerie"),result.getString("TotalSeries"));
					 projectsOfOwner.add(pro);
				}
				
				request.setAttribute( "list", projectsOfOwner );
				 
				 this.getServletContext().getRequestDispatcher( "/liste.jsp" ).forward( request, response );
				result.close();
				state.close();
				
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
	}

}
