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

@webservelt("/CostumerCadastrar") 
public class CadastraCustomer extends 
                HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   int id = Integer.parseInt(request.getParameter("id"));
	    String name = request.getParameter("name");
	    String city = request.getParameter("city");
	    int grade = Integer.parseInt(request.getParameter("grade"));

	    Customer customer = new Customer(id, name, city, grade);

	    // Configurações do banco de dados
	    String jdbcUrl = "jdbc:mysql://localhost:3306/BancoP2";
	    String jdbcUser = "root";
	    String jdbcPassword = " ";
	    
	    Connection conn = null;
	    PreparedStatement pstmt = null;

	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
	        String sql = "INSERT INTO customers (id, name, city, grade) VALUES (?, ?, ?, ?)";
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setInt(1, customer.getId());
	        pstmt.setString(2, customer.getName());
	        pstmt.setString(3, customer.getCity());
	        pstmt.setInt(4, customer.getGrade());
	        pstmt.executeUpdate();
	        
	    } catch (Exception e) {
	    	
	        e.printStackTrace();
	        
	    } finally {
	        if (pstmt != null) pstmt.close();
	        if (conn != null) conn.close();
	    }
	    RequestDispatcher rd = request.getRequestDispatcher("/registerCustomer.jsp");
	    request.setAttribute("customer", customer.getId());
	    rd.forward(request, response);
	}
}
