package interfacesPolymorphism;

public class CustomerManager {

	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {// vermek zoruna bırakılıyor
		// bir önceki yöntemde bu yoktu. bu şekilde unutulma ihtimalinini önüne geçilir
		this.customerDal = customerDal;
	}

	public void add() {
		// bu kısımda iş kodları yazılır

		customerDal.add();
	}
}
