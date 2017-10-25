package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double r;
		System.out.println("Input radius");
		r = sc.nextDouble();

		double l;
		l = 2 * Math.PI * r;
		System.out.println("Circle length is: " + l);

		sc.close();

	}

}
