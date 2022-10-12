package staticDemo;

public class ProductValidator {// C# da static class olabilir ama java da asıl sınıf olamaz
	// ara çolarak kullanacağın şeylerde static yapabilirsin
	// bu bir kere örneğinin oluşması ve her yerde onun kullanılması demektir
	static {
		System.out.println("illa static de yapıcı blok istiyorsan bu var");
	}

	public ProductValidator() {
		System.out.println("Bu yapici bloktur. New lenmeden calismaz.");
	}// C# da static de de yapıcı blok çalışır

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void newlenmedenCagrilmaz() {

	}

	public static class SiniİcindeSinif {// işte bu static olabilir
		public static void Sil() {
		}
	}
}
