package day7.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\randomfile.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			System.out.println("Error Message: " + e.getMessage());
		}
		StringBuilder data = new StringBuilder();
		while (sc != null && sc.hasNextLine()) {
			data.append(sc.nextLine());
			data.append("\n");
		}
		System.out.println(data);
	}

}
