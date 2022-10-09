package classesWithAttributesRepeat;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Casper Laptop");
		product.setPrice(500);
		product.setStockAmount(3);
		product.setRenk("");
		/*
		 * getter ve setter siz hali
		product.id = 1;
		product.description = "Casper Laptop";
		product.price = 500;// hatalı bilgi girişini engellemek için de Encapsulation lazım
		product.stockAmount = 3;
		product.renk = "";// vermesek de olur. sistem bozulmaz
		System.out.println(product.name);
*/
		ProductManager productManager = new ProductManager();
		productManager.add(product);
	}

}
