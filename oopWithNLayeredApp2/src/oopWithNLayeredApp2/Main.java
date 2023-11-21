package oopWithNLayeredApp2;

import business.ProductManager;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.JdbcProductDao;
import entities.Product;

public class Main {

	public static void main(String[] args) throws Exception{
		Product product1= new Product("","",123);//(String kursİsmi,String kursKategorisi,int fiyat);
		Product product2= new Product("","",123);
		
		Logger[] logger= {new MailLogger(),new FileLogger()};
		ProductManager productManager= new ProductManager(new JdbcProductDao(),logger);
		productManager.add(product1);productManager.add(product2);
	

	}

}
