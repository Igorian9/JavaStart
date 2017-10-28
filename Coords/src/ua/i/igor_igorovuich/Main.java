package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double r;
		System.out.println("Enter radius");
		r = sc.nextDouble();
		double x;
		System.out.println("Enter x");
		x = sc.nextDouble();
		double y;
		System.out.println("Enter y");
		y = sc.nextDouble();
		if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= r) {
			System.out.println("Point in a circle");
		} else {
			System.out.println("Point outside");
		}
		sc.close();
	}

}
