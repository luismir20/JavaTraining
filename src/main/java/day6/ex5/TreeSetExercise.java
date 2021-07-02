package day6.ex5;

import java.util.TreeSet;

public class TreeSetExercise {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(2);
		treeSet.add(4);
		treeSet.add(6);
		treeSet.add(8);
		treeSet.add(10);

		System.out.println("Original numbers: " + treeSet);

		System.out.println("numbers less than 7: " + treeSet.headSet(7));
	}

}
