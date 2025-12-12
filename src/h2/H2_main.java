package h2;

public class H2_main {

	public static void main(String[] args) {

		SimpleList myList = new SimpleList();

		myList.append(12);
		myList.append(45);
		myList.append(66);
		myList.append(12);
		myList.append(45);
		myList.append(60);

		System.out.println("Startliste: " + myList.asString());
		System.out.println();

		boolean inserted = myList.insertAfter(45, 4);
		System.out.println("Existiert ein Knoten, nach dem eingefuegt werden kann?: " + inserted);

		boolean deleted = myList.delete(45);
		System.out.println("Existiert ein Knoten, der geloescht werden kann?: " + deleted);

		System.out.println();
		System.out.println("Endliste: " + myList.asString());
	}
}
