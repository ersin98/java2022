package classesWithAttributes;

public class ProductManager {
	public void add(Product product) {
		// cbs
		System.out.println("Urun eklendi " + product.getName());
	}

	public void add2(int id, String name, String description, int stockAmount, double price, String yeniOzellik) {

	}
}
