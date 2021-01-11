package level1;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// artik yil sorusu

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a year?");
		int year = scan.nextInt();

		if (year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + " is a leap year!");
		} else if (year % 100 != 0 && year % 4 == 0) {
			System.out.println(year + " is a leap year!");
		} else {
			System.out.println(year + " is not a leap year!");
		}

		// with ternary

		String result = year % 100 == 0 ? year % 400 == 0 ? "Artik Yil" : "Artik Yil Degil"
				: year % 4 == 0 ? "Artik Yil" : "Artik Yil Degil";
		System.out.println(result);
		
		// ternary even or odd number
		
		int num3 =13;
		String output = (num3%2==0)?"even number":"odd number";
		System.out.println("number is : " + output);
		

		scan.close();

	}

}
