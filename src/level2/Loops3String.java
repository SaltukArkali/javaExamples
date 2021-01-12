package level2;

public class Loops3String {

	public static void main(String[] args) {
		// *Write a Java program to count the letters
		// * numbers and other characters of an input string.
		// You use while-loop for example "sal 1234 sel" 6 letters->4numbers->2 other
		// characters*/
		System.out.println(countLetter("sal 1234 sel"));
		System.out.println(countLetter2("Al 53 kal 87 buz"));
		findSum("gel 67biz 94 kl");
	}

	public static String countLetter(String str) {
		String abc = str;
		int a = 0, b = 0;
		while (str.length() > 0) {
			int i = 0;
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				a++;
			} else if (Character.isDigit(ch)) {
				b++;
			}
			str = str.substring(i + 1);
		}
		return abc + " has " + a + " letters " + b + " digit  and " + (abc.length() - (a + b)) + " other characters ";
	}
	
	public static String countLetter2(String str){
	    String abc=str;
	    int a=0,b=0;
	    while(str.length()>0){
	        int i=0;
	        String ch=str.substring(i,i+1);
	        if(ch.matches(".*[a-zA-Z].*")){
	            a++;
	        }else if (ch.matches(".*[0-9].*")){
	            b++;
	        }
	        str=str.substring(i+1);
	    }
	    return abc + " has "+a+" letters "+b+" digit  and "+(abc.length()-(a+b))+" other characters ";
	}
	
	static void findSum(String str)
	{
	   int total= str.length();
	   str = str.replaceAll("\\s", "");
	   int num =0;
	   int letter=0;
	   int i=0;
	   while(i<str.length()){
	      char ch = str.charAt(i);
	      // if current character is a digit
	      if (Character.isDigit(ch))
	         num ++;
	         // if current character is an alphabet
	      else {
	         letter++;
	      }
	      i++;
	   }
	   System.out.println(letter + " letters -> "+num +" numbers -> "+ (total-letter-num) + " other chars");
	}

}
