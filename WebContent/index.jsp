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

  <form class="form-inline" role="form">
    <div class="form-group">
      
      <input type="number" class="form-control" name="code_postal" placeholder="Entrer le code postal">
    </div>
    
    
    <button type="submit" class="btn btn-default">Rechercher</button>
  </form>
</div>

</body>
</html>