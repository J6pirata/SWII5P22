package br.com.model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@webservlet("/CadastraSaleman")
public class CadastraSalesMan extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException  {
		
		
		String salesmanId = request.getParameter("salesmanId");
	    String salesmanName = request.getParameter("salesmanName");
	    String salesmanCity = request.getParameter("salesmanCity");
	    double salesmanCommission = Double.parseDouble(request.getParameter("salesmanCommission"));

	    SalesMan salesMan = new SalesMan(salesmanId, salesmanName, salesmanCity, salesmanCommission);

	    
	    String jdbcUrl = "jdbc:mysql://localhost:3306/BancoP2";
	    String jdbcUser = "root";
	    String jdbcPassword = " ";
	    
	    Connection conn = null;
	    PreparedStatement pstmt = null;

	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
	        String sql = "INSERT INTO salesman (salesman_id, salesman_name, salesman_city, salesman_commission) VALUES (?, ?, ?, ?)";
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, salesMan.getSalesman_id());
	        pstmt.setString(2, salesMan.getSalesman_name());
	        pstmt.setString(3, salesMan.getSalesman_city());
	        pstmt.setDouble(4, salesMan.getSalesman_commission());
	        pstmt.executeUpdate();
	       
	    } catch (Exception e) {
	    	
	        e.printStackTrace();
	        
	    } finally {
	        if (pstmt != null) pstmt.close();
	        if (conn != null) conn.close();
	    }
	    RequestDispatcher rd = request.getRequestDispatcher("/registerCustomer.jsp");
	    request.setAttribute("salesman", salesMan.getSalesman_id());
	    rd.forward(request, response);
	}

}
