package level2;

import java.util.Scanner;

public class AtmExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bakiye = 1000;
		String islemler = "1. Islem: Bakiye Ögrenme\n" + "2. Islem: Para Cekme\n" + "3. Islem: Para Yatirma\n"
				+ "Cikis icin q'ya basiniz";
		System.out.println("*************************");
		System.out.println(islemler);
		System.out.println("*************************");
		while (true) {
			System.out.print("Islem seciniz: ");
			String islem = scanner.next();
			if (islem.equals("1")) {
				System.out.println("Bakiyeniz: " + bakiye);
			}
			if (islem.equals("2")) {
				System.out.print("Lütfen cekmek istediginiz miktari giriniz: ");
				int cekmeMiktari = scanner.nextInt();
				if (bakiye < cekmeMiktari) {
					System.out.println("Yetersiz bakiye!");
				} else if (bakiye >= cekmeMiktari) {
					bakiye -= cekmeMiktari;
					System.out.println("Yeni Bakiyeniz: " + bakiye);
				}
			}
			if (islem.equals("3")) {
				System.out.print("Lütfen yatirmak istediginiz miktari giriniz: ");
				int yatirmaMiktari = scanner.nextInt();
				bakiye += yatirmaMiktari;
				System.out.println("Yeni bakiyeniz: "+bakiye);
			}
			if(islem.equals("q")) {
				System.out.println("Sistemden cikiliyor..."); break;
			}
		}
		scanner.close();
	}
}
