<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <c:url value = "/CostumerCadastrar" var = "LinkServletCasdastraEmpresa"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Cliente</title>
</head>
<body>

    <form action="${LinkServletCasdastraEmpresa}" method="post">
        <label for="id">ID:</label><br>
        <input type="text" id="id" name="id"><br>
        <label for="name">Nome:</label><br>
        <input type="text" id="name" name="name"><br>
        <label for="city">Cidade:</label><br>
        <input type="text" id="city" name="city"><br>
        <label for="grade">Grau:</label><br>
        <input type="text" id="grade" name="grade"><br><br>
        <input type="submit" value="Registrar">
    </form>
</body>
</html>