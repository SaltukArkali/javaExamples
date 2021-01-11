package level1;

public class Example6Shapes {

	public static void main(String[] args) {

		ucgen();
		baklava();
		others();

	}

	public static void ucgen() {
		System.out.println("        1");
		System.out.println("       1  1");
		System.out.println("      1  2  1");
		System.out.println("     1  3  3 1");
		System.out.println("    1  4  6  4 1");
	}

	public static void baklava() {

		System.out.println("      A");
		System.out.println("     B  B");
		System.out.println("    C    C");
		System.out.println("   D      D");
		System.out.println("  E        E");
		System.out.println(" F          F");
		System.out.println("  E        E");
		System.out.println("   D      D");
		System.out.println("    C    C");
		System.out.println("     B  B");
		System.out.println("      A");

	}

	public static void others() {
		System.out.println("Would you like \'coffee\' or \'tea\' ?");
		System.out.println("Sağlığın için \"Evde Kal\".");
        double db= 10.231;
        int i= (int) db;
        System.out.println(i);        

	}

}
