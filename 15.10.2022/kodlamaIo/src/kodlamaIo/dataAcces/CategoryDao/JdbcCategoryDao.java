package kodlamaIo.dataAcces.CategoryDao;

import kodlamaIo.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category catagory) {
		System.out.println("JDBC ile katagori veritabanına eklendi");
	}

	@Override
	public Category select(Category category) {
		System.out.println("JDBC katagori veritabanında arandı ve bulundu");
		return new Category(1, "Aynı karagori");
	}

	@Override
	public Category select(Category category, String parameter1) {
		System.out.println("JDBC katagori veritabanında String parametreyle arandı ve bulunu");
		return new Category(1, "Aynı karagori");
	}

	@Override
	public Category select(Category category, int parameter1) {
		System.out.println("JDBC ile  katagori veritabanında int parametreyle arandı ve bulundu");
		return new Category(1, "Aynı karagori");
	}
}
