package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int day;
		System.out.println("Enter day");
		day = sc.nextInt();

		if ((day >= 1) && (day <= 31)) {
			switch (day % 7) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Thuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 0:
				System.out.println("Sunday");
				break;
			}
		} else {
			System.out.println("Un. day");
		}
		sc.close();
	}

}
