package classesWithAttributes;

public class Product {
	public Product(int id, String name, String descriptions, double price, int stockAmount, String yeniOzellik) {
		System.out.println("Dolu Yapici block calisti");
		//

		this.id = id;
		this.name = name;
		this.descriptions = descriptions;
		this.price = price;
		this.stockAmount = stockAmount;
		this.yeniOzellik = yeniOzellik;

	}

	public Product() {
		System.out.println("Bos Yapici block calisti");
	}

	private int id;
	private String name;
	private String descriptions;
	private double price;
	private int stockAmount;
	private String yeniOzellik;
	private String kod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;// _id diye tanımlasak burda this.id yerine _id kullanırdık. metodun id
						// değişkeniyle karışmamalı
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
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

	public String getYeniOzellik() {
		return yeniOzellik;
	}

	public void setYeniOzellik(String yeniOzellik) {
		this.yeniOzellik = yeniOzellik;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

}
