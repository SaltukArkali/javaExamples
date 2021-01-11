package level2;

import java.util.Scanner;

public class Loops1 {

	public static void main(String[] args) {
		// indexi tek sayi olan karakterleri yazdir
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime veya cumle giriniz?");
		String str = scan.nextLine();

		int length = str.length();
		int i = 0;
		do {
			if (i % 2 == 1) {
				System.out.print(str.charAt(i) + " ");
			}
			i++;
		} while (i < length);

		scan.close();
	}

}
