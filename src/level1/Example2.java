package level1;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// Sum of Digits
		Scanner scan = new Scanner(System.in);

		/*
		 * System.out.println("Give a 4 digit number?"); int num1=scan.nextInt();
		 * 
		 * int a = num1/1000; int d = num1%10; int b = (num1/100)%10; int c =
		 * (num1/10)%10; int sum = a+b+c+d; System.out.println("Sum is = " +sum);
		 */
		System.out.println("Enter your age?");
		String age = scan.nextLine();
		System.out.println(age);

		int yasInt = Integer.parseInt(age);
		System.out.println("New Age : " + (yasInt + 1));

		System.out.println("Please enter a number and find the double of that number?");
		String num2 = scan.next();
		System.out.println("Double of the given number is : " + Integer.valueOf(num2) * Integer.valueOf(num2));

		scan.close();

	}

}
