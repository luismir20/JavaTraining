package day4.ex1;

import java.util.Scanner;

public class UserMainCode {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.next();

		if (checkCharacters(input) == 1) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
		scan.close();
	}

	public static int checkCharacters(String input) {
		if (input.substring(0, 1).equals(input.substring(input.length() - 1))) {
			return 1;
		} else {
			return 0;
		}
	}
}
