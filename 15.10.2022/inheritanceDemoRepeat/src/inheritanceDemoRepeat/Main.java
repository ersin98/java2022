package inheritanceDemoRepeat;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new AskerKrediManager());
		// UI da base istendiği için ve bu da base yi miras aldığı için sorun çıkmıyor

		// Neden Inheritance önemli
		// birbirinin yerine geçebilecek durumlar için if kullanırsak kodlar birbirinin
		// içine girip karışır.
	}

}
