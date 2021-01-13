package level2;

import java.util.ArrayList;
import java.util.List;

public class AddStar {

	public static void main(String[] args) {
		// Given a list of strings, return a list, each of has * with it

		List<String> liste = new ArrayList<>();

		liste.add("ali");
		liste.add("veli");
		liste.add("fatma");

		List<String> newListe = new ArrayList<>();

		for (String w : liste) {
			newListe.add(w + "*");
		}
		System.out.println(newListe);

	}

}
