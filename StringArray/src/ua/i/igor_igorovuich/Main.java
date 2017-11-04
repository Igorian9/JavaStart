package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String strOne = "";
		System.out.println("Enter string");
		strOne = sc.nextLine();

		int count = 0;
		char[] strTwo = strOne.toCharArray();
		for (int i = 0; i < strOne.length(); i++) {
			if (strTwo[i] == 'b') {
				count++;
			}
		}
		System.out.println(count);

		sc.close();
	}

}
