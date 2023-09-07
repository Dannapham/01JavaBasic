package day3;

public class findLetter {
	public static void main(String[] args) {
		String strInput = "Hello World";
		char r = 'r';
		isfound(strInput, r);
	}

	public static void isfound(String strInput, char r) {
		int index = 0;
		while (index < strInput.length()) {
			if (strInput.charAt(index) == r) {
				System.out.println("chi so " + index);
				return;
			}
			index++;
		}
		System.out.println("khong tim thay r");
	}
}

