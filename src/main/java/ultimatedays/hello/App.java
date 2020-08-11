package ultimatedays.hello;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World! Avec ma modification  - test - test 2 - test 3 - test 5");

		System.out.println(getValue());
		System.out.println(getValue("tous !!!!!"));

	}

	public static String getValue() {
		return "Coucou Paola";
	}
	
	public static String getValue(String in) {
		return "Coucou à " + in;
	}
}
