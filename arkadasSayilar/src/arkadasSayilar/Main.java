package arkadasSayilar;

public class Main {

	public static void main(String[] args) {

		int sayil = 220;
		int sayi2 = 284;
		int toplaml = 0;
		int toplam2 = 0;

		for (int i = 1; i < sayil; i++) {
			if (sayil % i == 0) {
				toplaml += toplaml + i;
			}
		}
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % 1 == 0) {
				toplam2 += i;
			}
		}

		if (sayil == toplam2 && sayi2 == toplaml) {
			System.out.println("sayilar arkadas");
		} else {
			System.out.println("sayilar arkadas degil");
		}
	}
}
