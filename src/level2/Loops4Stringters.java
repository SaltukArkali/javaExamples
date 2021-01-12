package level2;

import java.util.Random;

public class Loops4Stringters {

	public static void main(String[] args) {
		// Faktoryel

		long sum = 1;
		for (int i = 1; i < 7; i++) {
			sum *= i;
		}
		System.out.println("7! = " + sum);
		
		//String tersten yazdirma
		
		String str = "karakartal";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
		//Random sayilar
		System.out.println("------------");
		int sayi = (int)(Math.random()*(1000));
		
		Random rnd = new Random();
		int num = rnd.nextInt(1000);
		
		System.out.println("Random iki sayi -- " + sayi + " ile " + num);
		
	}

}
