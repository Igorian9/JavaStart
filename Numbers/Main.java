package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input five-digit number");
		number = sc.nextInt();

		int firstNum;
		firstNum = number / 10000;
		System.out.println(firstNum);

		int secondNum;
		secondNum = number % 10000 / 1000;
		System.out.println(secondNum);

		int thirdNum;
		thirdNum = number % 1000 / 100;
		System.out.println(thirdNum);

		int fourthNum;
		fourthNum = number % 100 / 10;
		System.out.println(fourthNum);

		int fifthNum;
		fifthNum = number % 10;
		System.out.println(fifthNum);
		
		sc.close();

	}

}
