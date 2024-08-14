<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <c:url value = "/CadastraSaleman" var = "LinkServeltCasdastraSalesMan"/> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrando Salesman</title>
</head>
<body>
<form action="${LinkServletCadastraSalesMan}" method="post">
        <label for="salesmanId">ID do Vendedor:</label><br>
        <input type="text" id="salesmanId" name="salesmanId"><br>
        <label for="salesmanName">Nome do Vendedor:</label><br>
        <input type="text" id="salesmanName" name="salesmanName"><br>
        <label for="salesmanCity">Cidade do Vendedor:</label><br>
        <input type="text" id="salesmanCity" name="salesmanCity"><br>
        <label for="salesmanCommission">Comissão do Vendedor:</label><br>
        <input type="text" id="salesmanCommission" name="salesmanCommission"><br><br>
        <input type="submit" value="Registrar">
    </form>

</body>
</html>