class Animal{
	void eat() {
		System.out.println("Eating");
	}
}
class Dog extends Animal{
	void barking() {
		System.out.println("barking");
	}
}

public class Inherit {
	public static void main(String[] args) {
		Dog s1=new Dog();
		s1.barking();
		s1.eat();
		
	}

}
