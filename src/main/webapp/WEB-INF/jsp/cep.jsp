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


  
 
  <form action="/cep" method="post">
    <div class="form-group">
      <label for="qualcep">Cep:</label>
      <input type="text" class="form-control" name="qualcep" required>
      <div class="valid-feedback">ok</div>
      <div class="invalid-feedback">Por favor, preencha o campo!</div>
    </div>
    <button type="submit" class="btn btn-primary">Obter endereço</button>
  </form>
  <hr>

  <form action="/gravar" method="post">
  <div class="form-group">
	  	  
      <label for="logradouro">Logradouro:</label>
      <input type="text" class="form-control" value="${endereco.logradouro}" name="logradouro" required>
      <label for="complemento">Número:</label>
      <input type="text" class="form-control" value="${endereco.complemento}" name="complemento" required>
            <label for="bairro">Bairro:</label>
      <input type="text" class="form-control" value="${endereco.bairro}" name="bairro" required>
            <label for="localidade">Cidade:</label>
      <input type="text" class="form-control" value="${endereco.localidade}" name="localidade" required>
                  <label for="ibge">Codigo da cidade no IBGE (para emissão de NFE):</label>
      <input type="text" class="form-control" value="${endereco.ibge}" name="ibge" required>
            <label for="uf">Estado:</label>
      <input type="text" class="form-control" value="${endereco.uf}" name="uf" required>

                  <label for="cep">Cep:</label>
      <input type="text" class="form-control" value="${endereco.cep}" name="cep" required>
       
       
        </div>
    <button type="submit" class="btn btn-primary">Gravar</button>
    </form>
</div>


</body>
</html>