package h1;

public class Bruch {

	public int zaehler;
	public int nenner;

	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	private int ggT(int x, int y) {

		x = Math.abs(x);
		y = Math.abs(y);

		while (y != 0) {
			int rest = x % y;
			x = y;
			y = rest;
		}

		return x;
	}

	public void shorten() {
		int g = ggT(zaehler, nenner);

		zaehler = zaehler / g;
		nenner = nenner / g;
	}

	public boolean hasSameValueAs(Bruch b) {
		return this.zaehler * b.nenner == this.nenner * b.zaehler;
	}
}
