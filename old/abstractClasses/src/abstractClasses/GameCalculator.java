package abstractClasses;

//abstract sınıfta abstract metot olmak zorunda değil. birsürü de yazabiliriz
public abstract class GameCalculator {
	// burada tip değişkeni alıp if if diye birbirinin yerine geçebilen kodlar
	// yazmayacağız
	public abstract void hesapla();// kendi hesapla sını yazmak zorunda
	// bu bir imzadır

	public final void gameOver() {// olduğu gibi kullanılmak zorunda. Hiç bir zaman değişmeyecek bir kuraldır
		System.out.println("Oyun Bitti");
	}
	// game Over in üstüne yazılabilir hali
	// public void gameOver() {
	// System.out.println("Oyun Bitti");
	// }
	//
}
