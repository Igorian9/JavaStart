package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary number");
		String binNum = sc.nextLine();
		System.out.println(binNum + " -> " + calculateDec(binNum));
		sc.close();
	}

	public static int calculateDec(String binNum) {
		char[] cs = binNum.toCharArray();
		int number = 0;
		for (int i = cs.length - 1; i >= 0; i--) {
			if (cs[i] == '1') {
				number = (int) (number + Math.pow(2, i + 1));
			} else if (cs[i] != '0') {
				System.out.println("Number is not binary!");
				return number = 0;
			}

		}
		return number;
	}

}
