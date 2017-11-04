package ua.i.igor_igorovuich;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Enter array length");
		n = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter number");
			array[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(array));

		sc.close();
	}

}
