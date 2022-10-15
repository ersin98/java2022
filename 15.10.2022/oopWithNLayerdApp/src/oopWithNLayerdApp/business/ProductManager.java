package oopWithNLayerdApp.business;

import oopWithNLayerdApp.core.loggig.Logger;
import oopWithNLayerdApp.dataAccess.ProductDao;
import oopWithNLayerdApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;// List<Logger> loggers; //list koleksiyon

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}
		// HibernateProductDao producDao = new HibernateProductDao();
		// ProductDao productDao = new JdbcProductDao();
		productDao.add(product);

		for (Logger logger : loggers) {// [ab,file]
			logger.log(product.getName());
		}
	}
}
