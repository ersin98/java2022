package staticDemo;

public class ProductManager {
	// manager araçları static yapılmaz
	// bir değer taşıyor olsa mesela
	int bisey = 5;

	// her çağrıldığında ve veya işlem yapıldığında aynı nesne üzerinde işlem
	// yapılır

	// sadece yardımcı araçları static yapmak mantıklıdır
	public void add(Product product) {

		// ProductValidator validator = new ProductValidator();//diğer yerde static
		// tanımladığımız için new lemesek de olur

		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		} else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
	}
}
