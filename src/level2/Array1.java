package level2;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// Multi Dimensional Array olusturup deger atama

		// Deger atama 2.Yontem

		int arr[][] = { { 1, 2 }, { 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		System.out.println(Arrays.deepToString(arr));

		int top = arr[0][1] + arr[1][0] + arr[2][2];
		System.out.println("Toplam = " + top);

		// tum elemanlarin toplamini veren program. ONEMLI

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
		}

		System.out.println("Toplam = " + sum);

		// { {1, 2}, {5}, {6, 7, 8} } array'indeki tum elemanlarin toplamini bulunuz

		int arr2[][] = { { 1, 2 }, { 4 }, { 6, 7, 18 } };
		int sum1 = 0;

		for (int[] w : arr2) {

			for (int z : w) {
				sum1 = sum1 + z;
			}

		}
		System.out.println("Sum is = " +sum1);

	}

}
