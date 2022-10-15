package oopWithNLayerdApp;

import oopWithNLayerdApp.business.ProductManager;
import oopWithNLayerdApp.core.loggig.DatabaseLogger;
import oopWithNLayerdApp.core.loggig.FileLogger;
import oopWithNLayerdApp.core.loggig.Logger;
import oopWithNLayerdApp.core.loggig.MailLogger;
import oopWithNLayerdApp.dataAccess.HibernateProductDao;
import oopWithNLayerdApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "HUAWEI", 10000);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
	}
}
