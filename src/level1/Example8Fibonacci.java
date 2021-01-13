package level1;

public class Example8Fibonacci {

	public static void main(String[] args) {
		// Fibonacci under 10

		int a = 0;
		int b = 1;
		System.out.println(a + " - ");

		for (int i = 2; i <= 10; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println(c + " - ");
		}

	}

}
