package ua.igor_igorovuich;

public class Main {

	public static void main(String[] args) {
		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(arraysToString(array));

	}

	public static String arraysToString(int[] array) {
		String str = "[";
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				str += array[i] + ", ";
			} else {
				str += array[i] + "]";
			}
		}
		return str;
	}

}
