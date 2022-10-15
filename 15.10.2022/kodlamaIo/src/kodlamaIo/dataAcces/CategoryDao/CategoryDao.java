package kodlamaIo.dataAcces.CategoryDao;

import kodlamaIo.entities.Category;

//birbirinin elternatifi durumlarda Interface
public interface CategoryDao {

	void add(Category category);

	Category select(Category category);

	Category select(Category category, String parameter1);

	Category select(Category category, int parameter1);
}
