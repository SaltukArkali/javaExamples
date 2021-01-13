package level2;

import java.util.Scanner;

public class StringTersYazdirma {

	public static void main(String[] args) {
		// 1. Girilen String değeri tersten yazan Java kodunu yazınız. (for ile)

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz?");
		String str = scan.nextLine();
		System.out.println(str);

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();
		System.out.println("---------------");

		// 2.yol (while ile)

		int countStr = str.length();

		while (countStr > 0) {
			System.out.print(str.charAt(countStr - 1));
			countStr--;
		}

		scan.close();

	}

}
