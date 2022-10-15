package abstractDemo;

public class Main {
//yen iözellik getirirken eki kodları değiştiriyorsan bu sorunlu yazılımdır
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new OracleDatabaseManager();// bu şekilde ne istediğimizi
		// yazıyoruz. Yazmazsak boş çalışır
		customerManager.getCustomers();
	}

}
