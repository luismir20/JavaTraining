package day4.ex2;

public class CodeExTwo {
	public static void main(String[] args) {
		String s;
		String s2;
		s = "cat";
		s2 = "cat";
		System.out.println(s == s2);
		s = new String("cat");
		System.out.println(s == s2);
		StringBuffer sb = new StringBuffer("cat");
		sb.append(" Big");
		System.out.println(sb);
		System.out.println(s.equals(s2));
	}
}