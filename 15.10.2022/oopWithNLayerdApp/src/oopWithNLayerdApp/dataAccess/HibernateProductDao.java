package oopWithNLayerdApp.dataAccess;

import oopWithNLayerdApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		// sadece ve sadece db erişim kodları yazılır
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}
