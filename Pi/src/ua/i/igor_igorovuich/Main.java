package ua.i.igor_igorovuich;

import java.util.Formatter;

public class Main {

	public static void main(String[] args) {
		int numStr = 10;
		outPi(numStr);
	}

	public static void outPi(int numStr) {
		for (int i = 0; i < numStr; i++) {
			Formatter form = new Formatter();
			form.format("%." + (i + 2) + "f", Math.PI);
			String text = form.toString();
			System.out.println(text);
			form.close();
		}
	}

}
