package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Pleas enter a integer number?");

		List<Integer> nums = new ArrayList<>();

		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);

		int result = 1;
		for (Integer w : nums) {
			result = w * 2;
			if (result % 3 == 0) {
				System.out.println(result + " sayisi 3'e bölünebilir!");
			}
		}

		scan.close();

	}

}
