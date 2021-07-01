package day3.ex4;

class Animal {

	private String furColor= "furColor";
	
	public void makeNoise() {
		System.out.println("rarrr!");
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	public void getMakeNoise() {
		makeNoise();
	}
}

class Dog extends Animal {
	
}

public class AnimalFur {
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.getFurColor());
		dog.getMakeNoise();
	}
	
}