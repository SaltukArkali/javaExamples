package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loops2ForEach {

	public static void main(String[] args) {
//      Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin 
//      toplamını For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.

		List<String> liste = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Listeye atamak üzere elemanlarinizi giriniz: ");
		System.out.println("Yeterli elemana ulasinca 'q' giriniz!");

		String islem = "";
		int sum = 0;

		while (!(islem.equals("q"))) {

			System.out.print("Eleman giriniz: ");
			islem = scanner.nextLine();
			liste.add(islem);

		}
		liste.remove(liste.size() - 1);

		for (String w : liste) {

			int y = Integer.parseInt(w);
			sum += Math.pow(y, 2);

		}
		System.out.println(liste + "nin elemanlarinin kareleri toplami = " + sum);
		scanner.close();
	}

}
