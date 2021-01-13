package level2;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// Iki sayinin esitlik durumunu kontrol eden progrem

		Scanner scan = new Scanner(System.in);
		System.out.println("Schreiben Sie bitte erste Nummer?");
		int num1 = scan.nextInt();
		System.out.println("Schreiben Sie bitte zweite Nummer?");
		int num2 = scan.nextInt();

		vergleich(num1, num2);

		scan.close();
	}

	public static void vergleich(int num1, int num2) {
		boolean ergebnis = num1 == num2;
		System.out.println(ergebnis);
	}

}
