package interfacesPolymorphism;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		// customerManager.customerDal = new MySqlCustomerDal();
		// bunun unutulabilme ihtimali var.

		customerManager.add();
	}

}
