package br.com.model;

import java.util.List;

public class Customer {
	
 public int Customer_ID;
 public String Customer_name;
 public String City;
 public int grade;

 public Customer(int customer_id, String customer_name, String city, int Grade ) {
	 this.Customer_ID = customer_id;;
	 this.Customer_name = customer_name;
	 this.City = city;
	 this.grade = Grade;
 }
 
public Customer() {
	
}

public int getCustomer_ID() {
	return Customer_ID;
}
public void setCustomer_ID(int customer_ID) {
	Customer_ID = customer_ID;
}
public String getCustomer_name() {
	return Customer_name;
}
public void setCustomer_name(String customer_name) {
	Customer_name = customer_name;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}

 
}
