class Animal1{
	void eat() {
		System.out.println("Eating");
	}
}
class Dog1 extends Animal1{
	void bark() {
		System.out.println("barking");
		
	}
}
class Babydog extends Dog1{
	void weep() {
		System.out.println("weeping");
	}
}
public class Inherit2 {
	public static void main(String[] args) {
		Babydog d1=new Babydog();
		d1.weep();
		d1.bark();
		d1.eat();
	}
	

}
