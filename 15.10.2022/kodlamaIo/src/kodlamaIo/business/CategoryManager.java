package kodlamaIo.business;

import kodlamaIo.common.logging.Logger;
import kodlamaIo.dataAcces.CategoryDao.CategoryDao;
import kodlamaIo.entities.Category;

public class CategoryManager {
	CategoryDao categoryDao;
	private Logger[] loggers;// List[] List<Logger>

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;

	}

	public void add(Category category) throws Exception {
		if (categoryDao.select(category, category.getName()) != null) {
			throw new Exception("Kategori adı tekrar edemez");
		}
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}

}
