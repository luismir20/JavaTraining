package day6.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colorList = new ArrayList<String>();
		colorList.add("Gray");
		colorList.add("Silver");
		colorList.add("Blue");
		colorList.add("Black");
		colorList.add("White");
		colorList.add("Red");

		System.out.println("Original list: " + colorList);
		Collections.reverse(colorList);
		System.out.println("Reversed list: " + colorList);

	}

}
