package day3.ex3;

class A {
	void method_test() {
		System.out.println("Class A method");
	}
}

class B extends A {

	public B() {
		super.method_test();
		method_test();
		System.out.println();
	}

	void method_test() {
		System.out.println("Class B method");
	}

}

public class InheritanceExample {

	public static void main(String[] args) {
		B test = new B();

		test.method_test();
	}

}
