package interfaces;

public class Main {
	// nesne yönelimli programlamada 3 temel vardır. class(sınıf) ,abstract
	// class(soyut sınıf) ve interface(arayüz)
	// interface tam olarak sınıf değildir ama referans tutabilir
	public static void main(String[] args) {
		// class larda tüm operasyonların tamamlanmış olmaıs gerekiyordu
		// abstract larda kimi dolu olabilirdi kimi boş olabilirdi. kendisini inherite
		// eden doldurmak zorundaydı
		// interface de ise abstract ın tamamlanmamış operasyonları gibi tamamlanmamış
		// operasyonlar ile doludur.
		// günümüzde interface lere abstract gibi kullanım şekli de getirilmiştir ancak
		// tavsiye edilmez
		// bir sınıf birden fazla interface i implemet edebilir yani uygulayabilir
		ICustomerDal ıcCustomerDal = new MySqlCustomerDal();
		// interface ler newlenemez. kendisini implemente eden sınıfın referansını
		// tutabilir. bu poliformizm dir

		// interface ler iş katmanları arası geçişlerde kullanılabilir
	}

}
