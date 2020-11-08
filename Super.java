class Vehicle{
	String advantage="transport";
}
class Car extends Vehicle{
	String name="maruthi";
	void printcar() {
		System.out.println(name);
		System.out.println(super.advantage);
	}
}
public class Super {
public static void main(String[] args) {
	Car c=new Car();
	c.printcar();
}
}
