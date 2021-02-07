package level3;

import java.util.ArrayList;
import java.util.List;

public class Int1 {

	  /*
    1.In the programming language of your choice create a class with a method to return the length and longest words in a sentence. For example, "The cow jumped over the moon." should return 6 and "jumped".
    2.Create unit tests to test that method, reworking your code if needed. Tests should use a 'black box' approach, that is, be agnostic to your own implementation and be able to catch bugs if implementation changes.
    3.Explain any assumptions in comments.
    4.Write efficient, production-level codeand write test cases that cover as many edge cases as possible.
    5.Add a README explaining how to execute your tests.
    6.Share via GitHub
     */
    public static void main(String[] args) {
        findLongest("I am testing testing the lenght ");
        //test with number
        //test without any char
        //test with\n
        // lenghti esit ayni kelime 1 defa cikmali
    }
    public static void findLongest(String string) {
        String str=string.replaceAll("[,.:?!]","");
        if(str.length()==0){
            System.out.println("please enter a sentence");
            System.exit(0);
        }
        String[] list = str.split(" ");
        List<String> result = new ArrayList<>();
        String longest = "";
        int size = 0;
        int count = 0;
        for (String each : list) {
            if (each.length() > longest.length()) {
                longest = each;
                size=longest.length();
            }
        }
        for (String each : list) {
            if (each.length() == size) {
                result.add(each);
                longest = each;
                count++;
            }
        }
        if (count > 1) {
            System.out.println(result + " : " + size);
        } else {
            System.out.println(longest + " : " + size);
        }
    }

}
