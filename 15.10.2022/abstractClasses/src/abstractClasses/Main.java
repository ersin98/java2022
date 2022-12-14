package abstractClasses;

//abstract = soyut
//abstractClas = soyut sınıf
//inherite etme konusunda sınıflar ile aynıdır.
public class Main {

	public static void main(String[] args) {
		// örnekte kadın erkek ve çocuk için oyun puanı hesaplanacak
		// kadın ve erkek puanlaması aynı kalacak

		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();// diğerlerinde ayrı ayrı
		womanGameCalculator.gameOver();// hepsinde aynı

		// GameCalculator gameCalculator = new GameCalculator(); Asla new lenemez.
		// kullanmak için operasyonlarını doldurmak zorundayız.Normal yapı olarak
		// sınıflarla aynı ama böyle farkları var

		GameCalculator gameCalculator = new WomanGameCalculator();// abstract sınıf özellik tutabilir

		// kısacası kendisi new lenemez ve zorunlu operasyonlar eklenebilir
	}

}
