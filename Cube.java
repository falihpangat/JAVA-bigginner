import java.util.Scanner;

class Num{
	int n;
	void cube() {
		System.out.println(n*n*n);
	}
}
public class Cube {
	public static void main(String[] args) {
		Num n1=new Num();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n= sc.nextInt();
		n1.cube();
	}

}
q