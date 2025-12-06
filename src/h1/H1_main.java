package h1;

public class H1_main {
    public static void main(String[] args) {

        Bruch b1 = new Bruch(8, 12);
        b1.shorten();
        System.out.println(b1.zaehler + "/" + b1.nenner); // 2/3

        Bruch b2 = new Bruch(5, 3);
        Bruch b3 = new Bruch(15, 9);

        System.out.println(b2.hasSameValueAs(b3)); // true
    }
}
