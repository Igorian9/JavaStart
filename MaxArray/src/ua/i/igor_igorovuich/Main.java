package ua.i.igor_igorovuich;

public class Main {

	public static void main(String[] args) {
		int[] array = { 1, 5, 6, 2, 3 };
		System.out.println("Max = " + maxNumber(array));
	}

	public static int maxNumber(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

}
