package level2;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// Largest number in Array
		
		int[] arr = {4,8,15,3,5,99,75,33};
		Arrays.sort(arr);
		
		System.out.println("Largest number is : " + arr[arr.length-1]);
		
		
	}

}
