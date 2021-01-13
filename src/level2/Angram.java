package level2;

import java.util.Arrays;
import java.util.Scanner;

public class Angram {

	public static void main(String[] args) {
		 // Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  
        //Java kodunu yazınız.
        // rats star   listen slient

		Scanner sc=new Scanner ( System.in);
        System.out.println("Lüften kontrol edilecek 1. kelimeyi giriniz.");
        String str1 =sc.next();
        System.out.println("Lütfen kontrol edilecek 2. kelimeyi giriniz.");
        String str2 =sc.next();
        
        System.out.println(isAnagram (str1,str2));
        
        sc.close();
		
	}

	@SuppressWarnings("unused")
	public static boolean isAnagram(String str1, String str2) {

		boolean isAnagram1 = false;
	      
		char[] arr1 = str1.replace(" ", "").toLowerCase().toCharArray();
		char[] arr2 = str2.replace(" ", "").toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < arr2.length; i++) {
			if (arr1[i] != arr2[i]) {
				return isAnagram1 = false;

			}
		}
		return isAnagram1 = true;

	}

}
