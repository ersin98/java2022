package deneme;

public class Main {

	public static void main(String[] args) {
		String name = "Deneme bir iki";
		String newName = "";
		for (int i = 0; i < name.length(); i++) {
			if (i == name.length() - 1) {
				newName += name.charAt(i);
			} else if (name.charAt(i + 1) == ' ') {
				newName += name.charAt(i);
			} else if (name.charAt(i) == ' ') {
				newName += ' ';
			} else {
				newName += name.charAt(i) + "+";
			}
		}
		System.out.println(newName);

	}

}
