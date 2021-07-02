package day6.ex4;

import java.util.HashSet;

public class ArraysEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hash1 = new HashSet<String>();
		hash1.add("grey");
		hash1.add("blue");
		hash1.add("red");
		hash1.add("black");
		hash1.add("white");
		System.out.println("First HashSet: " + hash1);

		HashSet<String> hash2 = new HashSet<String>();
		hash2.add("grey");
		hash2.add("blue");
		hash2.add("brown");
		hash2.add("pink");
		hash2.add("purple");
		System.out.println("Second Hashset: " + hash2);

		hash1.retainAll(hash2);
		System.out.println("HashSet same elements on both sets " + hash1);
	}

}
