package inheritanceDemoRepeat;

//Base kredi manager kendini extends eden sınıfların referansını tutabilir.
//yani bir yerde base kredi manager i isteyip yerine öğretmen veya tarim yollayabiliriz
public class BaseKrediManager {
	public void hesapla() {
		System.out.println("Kredi Hesaplandı");
	}
}
