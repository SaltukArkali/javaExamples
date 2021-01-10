package level1;

import java.util.Scanner;

public class Example1 {
	
	public static void main(String[] args) {
		System.out.println("Be happy!");
		
		char harf = 'A';
		System.out.println(harf);
		
		int degerHarf = 'A';
		System.out.println(degerHarf);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		byte by= 101;
		int num = by;
		System.out.println(num);
		
		int num1 = 53;
		byte by2 = (byte) num1;
		System.out.println(by2);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name?");
		String name = scan.nextLine();
		System.out.println(name);
		
		
		System.out.println("Do you live in 'Germany?");
		boolean blGr=scan.nextBoolean();
		System.out.println(blGr);
		
		
		
		scan.close();
		
		
	}

}
