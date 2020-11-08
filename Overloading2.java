class Adder2{
	 static int add(int a,int b) {
	 return a+b;
	}
	 static double add(double a,double b,double c) {
		return a+b+c;
	}
}
public class Overloading2 {
 public static void main(String[] args) {
	System.out.println(Adder2.add(11,23));
	System.out.println(Adder2.add(23.2,24.5));
}
}
