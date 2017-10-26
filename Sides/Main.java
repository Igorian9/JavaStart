package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("Enter the side a of triangle");
		a = sc.nextInt();
		int b;
		System.out.println("Enter the side b of triangle");
		b = sc.nextInt();
		int c;
		System.out.println("Enter side c of triangle");
		c = sc.nextInt();
		if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
			System.out.println("Triangle exist");
		} else {
			System.out.println("Triangle doesn't exist");
		}

		sc.close();
	}

}
