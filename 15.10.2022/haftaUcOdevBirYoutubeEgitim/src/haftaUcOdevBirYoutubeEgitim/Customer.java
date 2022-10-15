package haftaUcOdevBirYoutubeEgitim;

//SOLID
//S= SINIF SADECE BİR İŞİ YAPABİLİR
public class Customer {
	// birbirinin yerine geçebilecek durumlar için if else kullanma
	private int id;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		city = city;
	}
}
