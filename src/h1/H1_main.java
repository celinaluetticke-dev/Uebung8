package h1;

public class H1_main {

	public static void main(String[] args) {

		Bruch b1 = new Bruch(8, 12);
		Bruch b2 = new Bruch(15, 9);

		System.out.println("eingegebener Bruch 1: " + b1.zaehler + "/" + b1.nenner);
		System.out.println("eingegebener Bruch 2: " + b2.zaehler + "/" + b2.nenner);

		b1.shorten();
		b2.shorten();

		System.out.println("gekuerzter Bruch 1: " + b1.zaehler + "/" + b1.nenner);
		System.out.println("gekuerzter Bruch 2: " + b2.zaehler + "/" + b2.nenner);

		boolean gleich = b1.hasSameValueAs(b2);

		System.out.println("Haben beide Brüche den gleichen Wert? " + gleich);
	}
}
