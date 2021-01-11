package level2;

import java.util.Scanner;

public class Loops3Str {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin, terini yazdirin.
		// Bu sayinin tersinin 2 fazlasini ekrana yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayi giriniz?");

		String num = scan.nextLine();

		String ters = "";

		for (int i = num.length() - 1; i >= 0; i--) {
			ters = ters + num.charAt(i) + ""; // char'i stringe ceviriyoruz.

		}

		System.out.println(ters);

		int tersInt = Integer.valueOf(ters);

		System.out.println(tersInt + 2);

		scan.close();
	}

}
