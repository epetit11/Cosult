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
								<tr><th>CODE INSEE</th><th>CODE POSTAL</th></tr>
								<c:forEach items="${liste}" var="emp">
									<tr>
										<td><a href="${pageContext.request.contextPath}/compare?codeInsee=${emp.getCodeInsee()}"><c:out value="${emp.getCodeInsee()}"></c:out></a></td>
										<td><c:out value="${emp.getCodePostal()}"></c:out></td>
										
									</tr>
								</c:forEach>
							</tbody>
						</table>
  
  
</div>

</body>
</html>