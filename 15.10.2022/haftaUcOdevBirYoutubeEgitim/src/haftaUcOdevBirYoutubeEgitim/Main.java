package haftaUcOdevBirYoutubeEgitim;

public class Main {
	public static void main(String[] args) {
		// implemente
		/*
		 * int sayi1 = 10; int sayi2 = 20; sayi1 = sayi2; sayi2 = 100;
		 * System.out.println(sayi1);
		 */

		// bir değişkenin newlenmiş halini başka değişkenin new lenmiş haline atarsan
		// A değişkeninin değer you B değişkenini değer yolu olmuş olur. A nın karşılığı
		// çöpe gider
		/*
		 * int[] sayilar1 = new int[] { 1, 2, 3 }; int[] sayilar2 = new int[] { 10, 20,
		 * 30 }; sayilar1 = sayilar2; sayilar2[0] = 1000;
		 * System.out.println(sayilar1[0]);
		 */

		/*
		 * CreditManager creditManager = new CreditManager(); creditManager.calculate();
		 * creditManager.save();
		 */

		// bu kısım Customer nesnesinin person ve Company olarak ayrılmadan önceki hali
		/*
		 * Customer customer = new Customer(); //örnek oluşturmak instance oluşturmak
		 * instance creative
		 * 
		 * customer.setFirstName("Ali"); System.out.println(customer.getFirstName()); //
		 * CustomerManager customerManager = new CustomerManager();// boş veriyle başlat
		 * // sonra doldur
		 * 
		 * Customer customerVideo = new Customer(); customerVideo.setFirstName("Cevar");
		 * customerVideo.setLastname("Bulut"); customerVideo.setCity("YGGDRASIL");
		 * CustomerManager customerManager = new CustomerManager(customerVideo);//
		 * çağırırken içini dolur. İki seçenek // aşırı yükleme sayesinde olabilir
		 * customerManager.save(customerVideo);
		 * 
		 */

		// İKİNCİ SİLİNEN PARÇA
		/*
		 * 
		 * Person person = new Person(); person.setFirstName("Ersin");
		 * person.setLastname("Yurtseven"); person.setId(3);
		 * person.setNationalIdentity(1234567890); person.setCity("Istanbul");
		 * CustomerManager customermanager = new CustomerManager(new Person());
		 * 
		 * // veya Customer
		 * 
		 * customermanager.save();"
		 * 
		 * Company company = new Company(); company.setId(3);
		 * company.setCity("Istanbul"); company.setCompanyName("YurtsevenAs");
		 * company.setTaxNumber("123"); CustomerManager customermanager2 = new
		 * CustomerManager(new Company());
		 * 
		 * // veya Customer
		 * 
		 * customermanager.save();
		 * 
		 * Customer c1 = new Person(); Customer c2 = new Company(); Customer c3 = new
		 * Person(); Customer c4 = new Company(); Customer c5 = new Person();
		 */

		// interface sayesinde iş yapan sınıfları imza seviyesinde tutarız.
		// Bağımlılıkları ortadan kaldırırız
		// Değişime direnç göstermesin diye
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
		customerManager.save();
	}
}