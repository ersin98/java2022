package inheritanceRepeat;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		// her iki sınıf da Person sınıfını miras alır. Yani ikisi de Person dur
		// ancak customer de epmloyee de kendine ait alanlara sahiptir
		// bu şekilde inheritance yapısı kurulmuş olur
		Employee employee = new Employee();
// özellik tutan sınıfların yaani Attribute ların örneği üstteki iki satırla bitiyor.

		EmployeeManager employeeManager = new EmployeeManager();// bunlar da işlem yapan sınıflardır
		CustomerManager customerManager = new CustomerManager();
		// en temel anlamda Inheritance bir sınıfın aynı zamanda başka sınıf olarak
		// kullanılmasıdır. Yani ortak metotları tekrar tekrar yazmanın önüne geçer.

	}

}
