package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double fuelPrice;
		System.out.println("Input fuel (UAH) price and press Enter");
		fuelPrice = sc.nextDouble();

		double fuelRas = 10.0;

		int distance;
		System.out.println("Input distance (km) and press Enter");
		distance = sc.nextInt();

		double totalSum;
		totalSum = fuelRas * fuelPrice * distance / 100.0;

		System.out.println(totalSum + " UAH");

		sc.close();
	}

}
