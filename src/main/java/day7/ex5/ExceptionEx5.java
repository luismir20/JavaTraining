package day7.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx5 {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the total runs scored: ");
			int runsScored = reader.read();
			System.out.println("Enter the total overs faced: ");
			int totalOvers = reader.read();
			int runRate = runsScored / totalOvers;
			System.out.println("Run Rate: " + runRate);

		} catch (ArithmeticException | NumberFormatException | IOException e) {
			if (e instanceof ArithmeticException) {
				System.out.println("java.lang.ArithmeticException: / by zero");
			} else if (e instanceof NumberFormatException) {
				System.out.println("java.util.NumberFormatException");
			} else {
				System.out.println("java.util.IOException");
			}
		}
	}

}