package br.com.model;

public class SalesMan {

	public int salesman_id;
	public String salesman_name;
	public String salesman_city;
	public double salesman_commission;
	
	public SalesMan(String salesmanId, String salesmanName, String salesmanCity, double salesmanCommission) {
		
	}
	public SalesMan() {
		
	}
	public int getSalesman_id() {
		return salesman_id;
	}
	public void setSalesman_id(int salesman_id) {
		this.salesman_id = salesman_id;
	}
	public String getSalesman_name() {
		return salesman_name;
	}
	public void setSalesman_name(String salesman_name) {
		this.salesman_name = salesman_name;
	}
	public String getSalesman_city() {
		return salesman_city;
	}
	public void setSalesman_city(String salesman_city) {
		this.salesman_city = salesman_city;
	}
	public double getSalesman_commission() {
		return salesman_commission;
	}
	
	
}
