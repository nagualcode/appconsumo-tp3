<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>AppConsumo Apis - TP 3 - Frederico Flores</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
	<body>
	
		<c:import url="/WEB-INF/jsp/cabecalho.jsp"/>

  
<div class="container-fluid" style="margin-top:80px">
		
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Id</th>
						<th>Sigla</th>
						<th>Nome</th>
						<th>Regiao</th>
					</tr>
				</thead>
				<c:forEach items="${estados}" var="est">
					<tbody>
						<tr>
							<td>${est.id}</td>
							<td>${est.sigla}</td>
							<td>${est.nome}</td>
							<td><a href="/municipios/${est.id}">${est.regiao.nome}</a></td>
						</tr>
					</tbody>
				</c:forEach>
			</table>
</div>
	</body>
</html>