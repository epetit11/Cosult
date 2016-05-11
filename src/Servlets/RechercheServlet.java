package Servlets;
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


@WebServlet("/recherche")
public class RechercheServlet extends HttpServlet {
	
	public void doPost( HttpServletRequest request, HttpServletResponse response ) 
			 throws ServletException, IOException {
		
		String codePostal= request.getParameter("code_postal");
		String codeInsee = null;
		String message;
		String etablissement;
		int nombreColonnes=0;
		List<Projet> projectsOfOwner = new LinkedList<Projet>();
		List<Code> code = new LinkedList<Code>();
		Code co=null;
		 Projet pro = null;
		
		if (codePostal.trim().isEmpty() ) {
            message = "Vous ne pouvez pas continuer sans entrer un code postal.";
            request.setAttribute( "messageError", message );
            this.getServletContext().getRequestDispatcher( "/index.jsp" ).forward( request, response );
        }
		else
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver OK");
				
				String url="jdbc:mysql://localhost/projetjee";
				String user="root";
				String passwordBdd="";
				
				
				Connection connection =  DriverManager.getConnection(url,user,passwordBdd);
				System.out.println("Connexion effective");
				
				
				//STATEMENT
				PreparedStatement state =connection.prepareStatement("SELECT * FROM correspondance WHERE codePostal=?");
				state.setString( 1, codePostal );
				
				ResultSet result=state.executeQuery();
				
				while(result.next())
				{
					
					
					co= new Code(result.getString("codeInsee"), result.getString("codePostal"));
					code.add(co);
					
					
				}
				
				request.setAttribute( "liste", code );
				 
				 this.getServletContext().getRequestDispatcher( "/commune.jsp" ).forward( request, response );
				
				//System.out.println("le code insee est "+codeInsee);
				
				
				/*while(result.next())
				{
					 pro = new Projet( result.getString("Ville"), result.getString("Commune"), result.getString("Etablissement"), result.getString("serieL"), result.getString("serieES"), result.getString("serieS"),result.getString("serieSTMG"),result.getString("serieSTI2D"),result.getString("serieSTD2A"),result.getString("serieSTL"),result.getString("serieST2S"),result.getString("serieMusiqDanse"),result.getString("serieHotellerie"),result.getString("TotalSeries"));
					 projectsOfOwner.add(pro);
				}
				
				request.setAttribute( "list", projectsOfOwner );
				 
				 this.getServletContext().getRequestDispatcher( "/liste.jsp" ).forward( request, response );*/
				result.close();
				state.close();
				
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
