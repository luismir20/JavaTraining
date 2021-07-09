package day7.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter A: ");
			int A = sc.nextInt();
			System.out.println("Enter B: ");
			int B = sc.nextInt();
			System.out.println("A / B: " + (A / B));
		} catch (ArithmeticException | InputMismatchException e) {
			if (e instanceof ArithmeticException) {
				System.out.println("java.lang.ArithmeticException: / by zero");
			} else {
				System.out.println("java.util.InputMismatchException");
			}
		}

	}

}
