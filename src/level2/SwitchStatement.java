package level2;

public class SwitchStatement {

	public static void main(String[] args) {
		String US = "USA";

		if (US == "USA" || US == "America" || US == "US") {
			System.out.println("American");
		} else {
			System.out.println("Not American");
		}

		// The switch statement below is the converted version to the switch statement
		// below...

		switch (US) {
		case "USA":
		case "America":
		case "US":
			System.out.println("American");
			break;
		default:
			System.out.println("Not American");
		}

		/// for loop

		String dup = "aabbcc";
		String result = "";

		for (int i = 0; i < dup.length() - 1; i++) {
			if (dup.charAt(i) == dup.charAt(i + 1)) {
				for (int j = i; j < i + 1; j++) {
					result += dup.substring(j, j + 1);
					j++;
				}
			}
		}
		System.out.println(result);

	}

}
