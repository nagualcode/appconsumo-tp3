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


  
 
  <form action="/cnpj" method="post">
    <div class="form-group">
      <label for="qualcnpj">Cnpj:</label>
      <input type="text" class="form-control" name="qualcnpj" required>
      <div class="valid-feedback">ok</div>
      <div class="invalid-feedback">Por favor, preencha o campo!</div>
    </div>
    <button type="submit" class="btn btn-primary">Obter Empresa</button>
  </form>
  <hr>

  <form action="/gravar" method="post">
  <div class="form-group">
	  	  
	  	  
      <label for="logradouro">Cep:</label>
      <input type="text" class="form-control" value="${empresa.cep}" name="cep" required>
      <label for="complemento">Logradouro:</label>
      <input type="text" class="form-control" value="${empresa.logradouro}" name="logradouro" required>
            <label for="bairro">Numero:</label>
      <input type="text" class="form-control" value="${empresa.numero}" name="numero" required>
            <label for="localidade">Bairro:</label>
      <input type="text" class="form-control" value="${empresa.bairro}" name="bairro" required>
                  <label for="ibge">Municipio:</label>
      <input type="text" class="form-control" value="${empresa.municipio}" name="municipio" required>
            <label for="uf">Tipo:</label>
      <input type="text" class="form-control" value="${empresa.porte}" name="porte" required>
       
        </div>
    <button type="submit" class="btn btn-primary">Gravar</button>
    </form>
</div>

</body>
</html>