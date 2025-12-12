package h2;

public class SimpleList {

	public Node head;

	public SimpleList() {
		this.head = new Node(Integer.MIN_VALUE);
		this.head.next = null;
	}

	public Node getFirst() {
		return this.head.next;
	}

	public Node getLast() {
		Node first = this.head.next;

		if (first == null) {
			return null;
		}

		Node scan = first;
		while (scan.next != null) {
			scan = scan.next;
		}
		return scan;
	}

	public void append(int newValue) {
		Node fresh = new Node(newValue);

		if (this.head.next == null) {
			this.head.next = fresh;
			return;
		}

		Node last = getLast();
		last.next = fresh;
	}

	public Node findFirst(int value) {
		Node scan = this.head.next;

		while (scan != null) {
			if (scan.value == value) {
				return scan;
			}
			scan = scan.next;
		}
		return null;
	}

	public boolean insertAfter(int preValue, int newValue) {
		Node preNode = findFirst(preValue);

		if (preNode == null) {
			return false;
		}

		Node fresh = new Node(newValue);
		fresh.next = preNode.next;
		preNode.next = fresh;
		return true;
	}

	public boolean delete(int value) {
		Node prev = this.head;
		Node scan = this.head.next;

		while (scan != null) {
			if (scan.value == value) {
				prev.next = scan.next;
				return true;
			}
			prev = scan;
			scan = scan.next;
		}
		return false;
	}

	public String asString() {
		Node scan = this.head.next;

		if (scan == null) {
			return "(leer)";
		}

		String s = "";
		while (scan != null) {
			s = s + scan.value;
			if (scan.next != null) {
				s = s + ",";
			}
			scan = scan.next;
		}
		return s;
	}
}
