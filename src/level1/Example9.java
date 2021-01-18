package level1;

import java.util.Arrays;
import java.text.DecimalFormat;

public class Example9 {

	public static void main(String[] args) {
		// Other examples

		int a = 5;
		int b = 1;
		a += b;
		a = --a + ++b;
		System.out.println(a);

		int A = 100;
		A *= 200;
		System.out.println(A); // 100*200=20000

		// boolean

		if (true) {
			System.out.println("Hello");
			System.out.println("world");
		}

		// Loops

		for (int i = 1; i <= 10; i++) {
			int result = (int) Math.sqrt(i);
			System.out.println(result);
		}

		// Array

		int[] arr = { 3, 17, 25, 39, 18, 13, 29, 25 };
		int sum = 42;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println("Sum of " + arr[i] + " and " + arr[j] + " is 42.");
				}
			}
		}
		int[][] x = { { 1, 2 }, { 1, 2, 3, }, { 4, 5, 6, 7, 8, } };
		System.out.println(Arrays.deepToString(x));

		// diger Ornek

		String[][] str2D = { { "Yusuf", "Betul" }, { "Murat", "Defne", "Ela" } };
		for (String[] each1 : str2D) {
			for (String each2 : each1)
				System.out.println(each2);
		}

		// format decimals

		DecimalFormat formating = new DecimalFormat("0.000");
		double d1 = 23.33414222255556666677777;

		// ==> obj.format(double) method returns a string value.
		// We have to convert it into double if we want to use in math operation...

		String num1 = formating.format(d1);
		System.out.println(num1);

		double d2 = 12.45967563487624376531209913;
		System.out.println(formating.format(d2));

		d2 = Double.parseDouble(formating.format(d2));

	}

}
