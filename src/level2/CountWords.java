package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountWords {

	  /*
    // girilen bir string'deki kelimelerin kacar defa kullanildigini bulan
        // program yaziniz
​
        // cumle : Ali okula geldi, Ayse okula geldi ama Fatma okula gelmedi.
     */
	
    public static void main(String[] args) {
        countWords("Ali okula geldi , Ayse okula geldi , ama Fatma okula gelmedi .");
    }

    public static void countWords(String sentence){
	
        String[] stringArray = sentence.split(" ");
        System.out.println(Arrays.asList(stringArray));
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
        System.out.println("arrayList = " + arrayList);
        
        Map<String, Integer> wordMap = new LinkedHashMap<>();
        
        //arrayList.get(i)
        // wordMap.put("Ali",2)
        
        for (int i = 0; i <arrayList.size(); i++) {
            wordMap.put(arrayList.get(i),
                    Collections.frequency(arrayList,arrayList.get(i)));
        }
        
        System.out.println(wordMap);
        
    }
}
