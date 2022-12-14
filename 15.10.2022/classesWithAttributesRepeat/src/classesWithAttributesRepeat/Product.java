package classesWithAttributesRepeat;

//ürün sınıfı. Sınıf adında Manager olmamamasının sebebi bir işlem yapmaması
//burada ürünün özellikleri tanımlanır
public class Product {
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		// bu bir Constructor. Constructor yapıcı, oluşturucu anlamına gelir
		System.out.println("Yapıcı blok bastan doldurularak calisti");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockAmount = stockAmount;
	}

	public Product() {
		System.out.println("Yapici blok bos basladı");
	}

	// private sadece tamınlandığı metot içerisinde geçerli
	private int id;// ürünü belirleyen eşsiz değer
	private String name;
	private String description;// açıklama
	private double price;
	private int stockAmount;// stok adeti
	private String renk;
	private String kod;

	// Encapsulation alanların kullanımını kısıtlar
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;// Product ın id si eşittir id
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}
}
