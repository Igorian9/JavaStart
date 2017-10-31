package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Enter number");
		n = sc.nextInt();
		int factorial = 1;

		if (n > 4 && n < 16) {
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			System.out.println(factorial);
		} else {
			System.out.println("Error");
		}
		sc.close();

	}

}
