class Bank{
	double intrest() {
		return 0;
	}
}
class Southindian extends Bank{
	double intrest() {
			return 8;
	}
}
class ICC extends Bank{
	double intrest() {
		return 10;
	}
}
class SBI extends Bank{
	double intrest(){
		return 5;
	}
}
public class Overriding {
 public static void main(String[] args) {
	Southindian s=new Southindian();
	ICC c=new ICC();
	SBI i=new SBI();
	System.out.println("South indian bank intrest : "+s.intrest());
	System.out.println("ICC bank intrst : "+c.intrest());
	System.out.println("State bank of indua intrest : "+i.intrest());
}
}
