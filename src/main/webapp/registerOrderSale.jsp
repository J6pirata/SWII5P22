<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <c:url value = "/CadastraOrderSale" var = "LinkServletCasdastraOrderSale"/> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrado ordem de vendas</title>
</head>
<body>
<form action="${LinkServletCadastraOrderSale}" method="post">
        <label for="purchAmt">Valor da Venda:</label><br>
        <input type="text" id="purchAmt" name="purchAmt"><br>
        <label for="ordDate">Data da Venda:</label><br>
        <input type="date" id="ordDate" name="ordDate"><br><br>
        <input type="submit" value="Registrar">
    </form>

</body>
</html>