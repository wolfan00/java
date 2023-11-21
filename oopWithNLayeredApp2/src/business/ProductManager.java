package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.ProductDao;
import entities.Product;


public class ProductManager {
	private ProductDao productDao;
	private Logger[] logger;
	private List<String> course = new ArrayList<String>();
	private List<String> software= new ArrayList<String>();
	public ProductManager( ProductDao productDao,Logger[] logger) {
		this.productDao=productDao;
		this.logger=logger;
	}
	public void add(Product product) throws Exception{
		productDao.add();
		
		if(course.contains(product.getCourse())) {
				throw new Exception("kurs ismi aynı olamaz");
			}
			if(software.contains(product.getSoftware())) {
				throw new Exception("kurs kategorisi aynı olamaz");
			}
			course.add(product.getCourse());
		software.add(product.getSoftware());
			if(product.getCoursePrice()<0) {
			throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz.");
		}
		
		for(Logger log:logger) {
			log.add(product);
		}
	}
	
}
