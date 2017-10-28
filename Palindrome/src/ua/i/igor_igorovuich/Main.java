package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter six-digit number");
		number = sc.nextInt();
		int firstNum;
		firstNum = number / 100000;
		int secondNum;
		secondNum = number % 100000 / 10000;
		int thirdNum;
		thirdNum = number % 10000 / 1000;
		int fourthNum;
		fourthNum = number % 1000 / 100;
		int fifthNum;
		fifthNum = number % 100 / 10;
		int sixNum;
		sixNum = number % 10 / 1;
		if (firstNum == sixNum && secondNum == fifthNum && thirdNum == fourthNum) {
			System.out.println("Palindrome!");
		} else {
			System.out.println("Not a palindrome!");
		}
		sc.close();
	}

}
