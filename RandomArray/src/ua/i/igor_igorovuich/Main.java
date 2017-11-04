package ua.i.igor_igorovuich;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] arrayOne = new int[15];

		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = (int) (Math.random() * 100);
		}

		System.out.println("First array: \n" + Arrays.toString(arrayOne));
		int[] arrayTwo = Arrays.copyOf(arrayOne, arrayOne.length * 2);
		for (int i = 0; i < arrayOne.length; i++) {
			arrayTwo[i + arrayOne.length] = arrayOne[i] * 2;
		}
		System.out.println("Second array: \n" + Arrays.toString(arrayTwo));
	}

}
