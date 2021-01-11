package level1;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// swap two numbers

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two int numbers to swap!");

		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("before first number : " + a);
		System.out.println("before first number : " + b);
		int c = 0;

		c = a;
		a = b;
		b = c;

		System.out.println("after first number : " + a);
		System.out.println("after first number : " + b);

		// second way

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Again after first number : " + a);
		System.out.println("Again after first number : " + b);

		scan.close();

	}

}
