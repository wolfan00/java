package core.logging;

import entities.Product;

public class MailLogger implements Logger{

	@Override
	public void add(Product product) {
		System.out.println("Mail ile log işlemi gerçekleşti: "+product.getCourse() );
		
	}
	
}
