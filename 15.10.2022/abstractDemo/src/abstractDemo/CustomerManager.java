package abstractDemo;

public class CustomerManager {
	BaseDatabaseManager databaseManager;// aşağıda database yazmak yerine buranın database istediğini
	// yazıyoruz

	public void getCustomers() {

		// böyle yazarsak OracleDatabase ye bağımlı yapar
		// OracleDatabaseManager oracleDatabaseManager =new OracleDatabaseManager();
		// oracleDatabaseManager.getData();

		databaseManager.getData();
	}
}
