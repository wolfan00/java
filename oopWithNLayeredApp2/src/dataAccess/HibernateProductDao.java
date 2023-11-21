package dataAccess;


public class HibernateProductDao implements ProductDao{
	@Override
	public void add() {
		System.out.println("Hibernate ile veri tabanına eklendi: ");
		
	}
}
