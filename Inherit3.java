class Animal2{
	void eat() {
		System.out.println("Eating");
	}
}
class Dog2 extends Animal2{
	void bark() {
		System.out.println("barking");
	}
}
class Cat extends Animal2{
	void meow() {
		System.out.println("meowing");
	}
	
}

public class Inherit3 {
public static void main(String[] args) {
	Dog2 q1=new Dog2();
	Cat  c1=new Cat();
	c1.eat();
	c1.meow();
	q1.bark();
	q1.eat();
}
}
