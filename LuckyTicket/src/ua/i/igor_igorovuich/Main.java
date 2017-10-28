package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter number of ticket");
		number = sc.nextInt();

		int firstNum;
		firstNum = number / 1000;
		int secondNum;
		secondNum = number % 1000 / 100;
		int thirdNum;
		thirdNum = number % 100 / 10;
		int fourthNum;
		fourthNum = number % 10 / 1;
		int testOne;
		testOne = firstNum + secondNum;
		int testTwo;
		testTwo = thirdNum + fourthNum;
		int testThree;
		int testFour;

		if (testOne >= 10 && testTwo < 10) {
			testThree = testOne / 10;
			testFour = testOne % 10;
			if ((testThree + testFour) == testTwo) {
				System.out.println("It's a SUPER lucky ticket!!! Eat it!");
			}
		} else if (testOne < 10 && testTwo >= 10) {
			testThree = testTwo / 10;
			testFour = testTwo % 10;
			if ((testThree + testFour) == testOne) {
				System.out.println("It's a SUPER lucky ticket!!! Eat it!");
			}
		} else if (testOne >= 10 && testTwo >= 10) {
			int testFive;
			int testSix;
			testThree = testOne / 10;
			testFour = testOne % 10;
			testFive = testTwo / 10;
			testSix = testTwo % 10;
			if ((testThree + testFour) == (testFive + testSix)) {
				System.out.println("It's a SUPER-MEGA-ULTRA LUCKY ticket!!! EAT IT NOW!!");
			}
		} else if (testOne == testTwo) {
			System.out.println("It's a lucky ticket! Eat it.");
		} else {
			System.out.println("Unfortunately it's not a lucky ticket...");
		}
		
		sc.close();
	}

}
