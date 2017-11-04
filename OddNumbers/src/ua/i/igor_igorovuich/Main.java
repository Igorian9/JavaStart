package ua.i.igor_igorovuich;

public class Main {

	public static void main(String[] args) {

		int[] array = { 0, 5, 9, 4, 7, 1, 3, 19 };
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				count++;
			}
		}
		System.out.println("Odd numbers count = " + count);
	}

}
