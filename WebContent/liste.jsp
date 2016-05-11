<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container" >
  <h2>Retrouver le taux de résultat de votre commune </h2>
  
  </br>
  </br>
  
  <p>
	${messageError }
  </p>

  						<table border="2">
							<tbody>
								<tr><th>VILLE</th><th>COMMUNE</th><th>ETABLISSEMENT</th><th>SERIE L</th><th>SERIE ES</th><th>SERIE S</th><th>SERIE STMG</th><th>SERIE STI2D</th><th>SERIE STD2A</th><th>SERIE STL</th><th>SERIE ST2S</th><th>SERIE MUSIQUE DANSE</th><th>SERIE HOTELLERIE</th><th>TOTAL SERIES</th></tr>
								<c:forEach items="${list}" var="emp">
									<tr>
										<td><c:out value="${emp.getVille()}"></c:out></td>
										<td><c:out value="${emp.getCommune()}"></c:out></td>
										<td><c:out value="${emp.getEtablissement()}"></c:out></td>
										<td><c:out value="${emp.getSerieL()}"></c:out></td>
										<td><c:out value="${emp.getSerieES()}"></c:out></td>
										<td><c:out value="${emp.getSerieS()}"></c:out></td>
										<td><c:out value="${emp.getSerieSTMG()}"></c:out></td>
										<td><c:out value="${emp.getSerieSTI2D()}"></c:out></td>
										<td><c:out value="${emp.getSerieSTD2A()}"></c:out></td>
										<td><c:out value="${emp.getSerieSTL()}"></c:out></td>
										<td><c:out value="${emp.getSerieST2S()}"></c:out></td>
										
										<td><c:out value="${emp.getSerieMusiqDanse()}"></c:out></td>
										<td><c:out value="${emp.getSerieHotellerie()}"></c:out></td>
										<td><c:out value="${emp.getTotalSeries()}"></c:out></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						
						</br>
						</br>
						<a href="index.jsp"> <button>Effectuer une nouvelle recherche </button> </a>
  
  
</div>

</body>
</html>