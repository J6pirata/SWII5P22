package br.com.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdeSales {
	private  List<OrdeSales> ordersales = new ArrayList<>();
    private Date DataVenda = new Date();
    private int purch_AMT;
    
    public OrdeSales() {
    	
    }
   
	public List<OrdeSales> getOrdersales() {
		return ordersales;
	}
	
	public Date getDataVenda() {
		return DataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		DataVenda = dataVenda;
	}
	public int getPurch_AMT() {
		return purch_AMT;
	}
	public void setPurch_AMT(int purch_AMT) {
		this.purch_AMT = purch_AMT;
	}
    
    
    
   
    
}
