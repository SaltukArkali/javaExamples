package level2;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println(isPalindrome("abcddcba"));
		
	}

	public static boolean isPalindrome(String str) {

		if (str == null) {
			return false;
		}

		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString().equals(str);

	}

}
