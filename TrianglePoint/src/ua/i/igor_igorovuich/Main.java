package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double x;
		System.out.println("Enter coordinate x");
		x = sc.nextDouble();

		double y;
		System.out.println("Enter coordinate y");
		y = sc.nextDouble();

		double xA = 0;
		double yA = 0;
		double xB = 4;
		double yB = 4;
		double xC = 6;
		double yC = 1;
		double testOne;
		testOne = (xA - x) * (yB - yA) - (xB - xA) * (yA - y);
		double testTwo;
		testTwo = (xB - x) * (yC - yB) - (xC - xB) * (yB - y);
		double testThree;
		testThree = (xC - x) * (yA - yC) - (xA - xC) * (yC - y);

		if ((testOne >= 0 && testTwo >= 0 && testThree >= 0) || (testOne <= 0 && testTwo <= 0 && testThree <= 0)) {
			System.out.println("Point in the triangle");
		} else {
			System.out.println("Point outside the triangle");
		}

		sc.close();

	}

}
