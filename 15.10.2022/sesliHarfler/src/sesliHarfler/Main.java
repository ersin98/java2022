package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'A';
		switch (harf) {
		case 'A':
		case 'I':
		case '0':
		case 'U':
			System.out.println("Kalın seslidir");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("Înce seslidir");
		default:
			System.out.println("İkisi de değil");
		}

	}

}
