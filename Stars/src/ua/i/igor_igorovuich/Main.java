package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a = 5;
		int b;
		System.out.println("Enter count");
		b = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (j % 2 == 0) {
					System.out.print("+++");
				} else {
					System.out.print("***");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
