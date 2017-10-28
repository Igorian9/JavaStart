package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("Enter a");
		a = sc.nextInt();

		int b;
		System.out.println("Enter b");
		b = sc.nextInt();

		int c;
		System.out.println("Enter c");
		c = sc.nextInt();

		int d;
		System.out.println("Enter d");
		d = sc.nextInt();

		int max;
		max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}

		System.out.println("Max = " + max);
		sc.close();

	}

}
