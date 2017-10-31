package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("Enter high");
		a = sc.nextInt();

		int b;
		System.out.println("Enter width");
		b = sc.nextInt();

		if (a > 0 && b > 0) {
			for (int i = 1; i <= a; i++) {
				if (i == 1 || i == a) {
					for (int j = 1; j <= b; j++) {
						System.out.print("*");
					}
				} else {
					for (int k = 1; k <= b; k++) {
						if (k == 1 || k == b) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("Error!");
		}

		sc.close();
	}

}
