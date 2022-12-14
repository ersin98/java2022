package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// çağırırken içine yazabiliriz
		Product product = new Product(1, "Laptop", "Casper Laptop", 5000, 3, "Yeni bir ozellik");

		// Product product = new Product(); veya boş çağırıp
		// şekilde de doldurabiliriz
		product.setName("Laptop");
		product.setId(1);
		product.setDescriptions("Casper Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setYeniOzellik("sonradan nesne eklemek bu yontemde daha kolay");// ve bunu eklemek zorunda da değilim
//

		System.out.println(product.getName());
		System.out.println(product.getKod());
		ProductManager productManager = new ProductManager();
		productManager.add(product);

		// verimsiz
		// productManager.add2(1, " ", " ", 0, 0);

	}
}
