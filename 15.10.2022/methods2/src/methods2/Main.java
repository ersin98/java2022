package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hva çok güzel";
		String yenimesaj = sehieVer();// mesaj.substring(0, 2);
		System.out.println(yenimesaj);
		int sayi = topla(3, 5);
		System.out.println(sayi);
		int toplam = topla2(6, 5, 3, 4, 8, 9);// hiç de gitmeyebilirdi istediğimiz kadar da gidebilir
	}

	public static void ekle() {
		System.out.println("Ekle");
	}

	public static void sil() {
		System.out.println("Sil");
	}

	public static void guncelle() {
		System.out.println("Güncelle");
		return;// sadece bitir demek
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

//arguments
	public static int topla2(int... sayilar) {// int array gibi çalışır.
		int toplam = 0;
		for (int sayi : sayilar) {// sayilar her elemanı için sayi
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehieVer() {
		return "Ankara";
	}
}
