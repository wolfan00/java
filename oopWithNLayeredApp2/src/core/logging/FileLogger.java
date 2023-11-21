package core.logging;

import entities.Product;

public class FileLogger implements Logger{

	@Override
	public void add(Product product) {
		System.out.println("Dosya ile log işlemi gerçekleşti: "+product.getCourse() );
		
	}
	
}

