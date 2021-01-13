package level3;

public class Varargs1 {

	public static void main(String[] args) {
		// more than one integer input

		addition(1, 7, 9, 15, 34);

	}

	public static void addition(int... x) {

		int result = 0;

		for (int w : x) {
			result += w;
		}
		System.out.println("Result = " + result);
	}

}
