package ua.i.igor_igorovuich;

public class Main {

	public static void main(String[] args) {
		String str = "Hello World. Hello, World.";
		System.out.println(wordsCount(str) + " words here.");
	}

	public static int wordsCount(String str) {
		String[] t = str.split("[ ]");
		int count = 0;
		while (count < t.length) {
			count++;
		}
		return count;
	}
}
