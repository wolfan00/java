package dataAccess;


public class JdbcProductDao implements ProductDao{

	@Override
	public void add() {
		System.out.println("Jdbc ile veri tabanına eklendi: ");
		
	}
	
}
