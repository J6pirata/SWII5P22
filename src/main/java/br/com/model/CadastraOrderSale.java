package br.com.model;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@webServel("/CadastraOrderSale")
public class CadastraOrderSale extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throwsServletException, IOException{
	double purchAmt = Double.parseDouble(request.getParameter("purchAmt"));
    String ordDateStr = request.getParameter("ordDate");

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date ordDate = null;

    try {
        ordDate = sdf.parse(ordDateStr);
    } catch (Exception e) {
        e.printStackTrace();
    }

    OrderSales orderSales = new OrderSales(purchAmt, ordDate);

    String jdbcUrl = "jdbc:mysql://localhost:3306/seuBancoDeDados";
    String jdbcUser = "root";
    String jdbcPassword = " ";
    
    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
        String sql = "INSERT INTO ordersales (purch_amt, ord_date) VALUES (?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setDouble(1, orderSales.getPurchAmt());
        pstmt.setDate(2, new java.sql.Date(orderSales.getOrdDate().getTime()));
        pstmt.executeUpdate();
        out.println("Venda cadastrada com sucesso!");
    } catch (Exception e) {
        e.printStackTrace();
        out.println("Erro ao cadastrar venda.");
    } finally {
        if (pstmt != null) pstmt.close();
        if (conn != null) pstmt.close();
    }
    RequestDispatcher rd = request.getRequestDispatcher("/registerOrderSale.jsp");
    request.setAttribute("ordersale", salesMan.getSalesman_id());
    rd.forward(request, response);
}
