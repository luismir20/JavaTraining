package day6.ex2;

import java.util.ArrayList;
import java.util.List;

public class ArraysExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colorList = new ArrayList<String>();
		colorList.add("Gray");
		colorList.add("Silver");
		colorList.add("Blue");
		colorList.add("Black");
		colorList.add("White");
		colorList.add("Red");

		for (String element : colorList) {
			System.out.println(element);
		}

	}

}