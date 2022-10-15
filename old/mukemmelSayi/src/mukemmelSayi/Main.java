package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number = 5;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % 1 == 0) {
				total += 1;
			}
			if (total == number) {
				System.out.println("Mükemmel sayıdır");
			} else {
				System.out.println("Mükemmel sayı değildir");
			}
		}
	}

}
