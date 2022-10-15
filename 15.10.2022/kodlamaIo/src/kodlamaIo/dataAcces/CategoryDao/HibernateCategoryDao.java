package kodlamaIo.dataAcces.CategoryDao;

import kodlamaIo.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile katagori veritabanına eklendi");

	}

	@Override
	public Category select(Category category) {
		System.out.println("Hibernate ile katagori veritabanında arandı ve bulundu");
		return new Category(1, "Aynı karagori");
	}

	@Override
	public Category select(Category category, String parameter1) {
		System.out.println("Hibernate ile katagori veritabanında String parametreyle arandı ve bulundu");
		return new Category(1, "Aynı karagori");
	}

	@Override
	public Category select(Category category, int parameter1) {
		System.out.println("Hibernate ile katagori veritabanında int parametreyle arandı ve bulundu");
		return new Category(1, "Aynı karagori");
	}

}
