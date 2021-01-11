package level1;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// palindromic sentence

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence!");
		String str1 = scan.nextLine();

		String str2 = "";

		int lengthStr = str1.length();

		for (int i = 0; i < lengthStr; i++) {
			str2 += str1.charAt(lengthStr - 1 - i);
		}
		System.out.println("Ters cümle : " + str2);

		scan.close();

	}

}
