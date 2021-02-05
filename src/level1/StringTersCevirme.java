package level1;

import java.util.Scanner;

public class StringTersCevirme {

	public static void main(String[] args) {
 // Kullanicidan bir String alarak bu Stringi terse cevirin ve yazdirin
        
        // for loop
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen tesrsine cevirmek istediginiz String'i yaziniz");
        String input=scan.nextLine();
        String tersString="";
        
        for (int i = input.length()-1; i >=0; i--) { // merhaba
            tersString += input.charAt(i); //abah
        }
        System.out.println("for loop ile ters cevirdigimiz : " + tersString);
        
        // 2.yol StringBuffer ile ters cevirme
        StringBuffer strB = new StringBuffer();
        strB.append(input);
        strB=strB.reverse();
        System.out.println("StringBuffer ile ters cevirdigimiz : " + strB);
        
        // 3.yol method olusturup array kullanalim
        arrayIleTersineCevir(input);
        scan.close();
    }
    public static String arrayIleTersineCevir(String input) {
        
        String[] kelimeArr=input.split("");
        //System.out.println(Arrays.toString(kelimeArr));
        
        String tersString= "";
        for (int i = kelimeArr.length-1; i >=0; i--) {
            tersString+=kelimeArr[i];
        }
        //System.out.println("method ve array kullanarak cevirdigimiz : " + tersString);
        return tersString;

	}

}
