package ua.i.igor_igorovuich;

public class Main {

	public static void main(String[] args) {
		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int number = 7;
		System.out.println(indexSearch(array, number));
	}

	public static int indexSearch(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return i;
			}
		}
		return -1;
	}

}
