package haftaUcOdevBirYoutubeEgitim;

//Katmanlı Mimariler. Görevleri birbirinden ayır
public class CustomerManager {
	private Customer customer;// nesneyi her sınıfta kullanmak için lazım

	private ICreditManager creditManager;

//alışkanlık diye boid yazıp durma. onstructor yazarken void olmaz
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;// alınan nesneyi kullanmak için ürettiğimize eşitliyoruz
		this.creditManager = creditManager;
	}

	public void save() {
		System.out.println("Kaydedildi");
	}

	public void delete() {
		System.out.println("Silindi");
	}

	public void giveCredit() {
		this.creditManager.calculate();
		System.out.println("Kredi Verildi");

	}
}
