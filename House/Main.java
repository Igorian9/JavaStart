package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int apartment;
		System.out.println("Enter number of apartment");
		apartment = sc.nextInt();

		if ((apartment >= 1) && (apartment <= 144)) {
			int frontDoor;
			int floor;
			frontDoor = (apartment - 1) / 36 + 1;
			floor = (apartment - 1) % 36 / 4 + 1;
			System.out.println("Front door number: " + frontDoor + ". \nFloor number: " + floor + ".");
		} else {
			System.out.println("Unknown apartment number!");
		}

		sc.close();
	}

}
