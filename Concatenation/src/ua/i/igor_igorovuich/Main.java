package ua.i.igor_igorovuich;

public class Main {

	public static void main(String[] args) {
		int a = 5;
		double b = 1.1;
		String str = "Hello World";
		System.out.println(concatenation(a, b, str));
	}

	public static String concatenation(int a, double b, String str) {
		double sum = a + b;
		String conc = str + " " + sum;
		return conc;
	}

}
