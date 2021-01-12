package level1;

import java.util.Scanner;

public class Examples7 {

	public static void main(String[] args) {
		/*
		 * 1-Kullanıcıdan bir tam sayı alıniz Bu sayıdan küçük kaç tane tam kare sayı
		 * olduğu bulunuz ve adet bilgisi konsol ekrana çıktı olarak yazdırıniz
		 * 2-kullanicindan 2 sayi aliniz buyuk sayi ve kucuk sayi olarak ekrana
		 * yazdiriniz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a integer?");
		int num = scan.nextInt();

		double kok = Math.sqrt(num);
		System.out.println("Girilen sainin karekoku = " +kok);

		System.out.println("Please enter first number?");
		int firstNum = scan.nextInt();
		System.out.println("Please enter second number?");
		int secondNum = scan.nextInt();

		if (firstNum > secondNum) {
			System.out.println("En büyük sayi = " + firstNum);
		} else if (firstNum < secondNum) {
			System.out.println("En büyük sayi = " + secondNum);
		} else {
			System.out.println("sayilar birbirine esit ve degeri sudur = " + firstNum);
		}

		scan.close();

	}

}
