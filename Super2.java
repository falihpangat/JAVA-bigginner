class School{
	String name = "National";
	void schoolname() {
		System.out.println(name);
	}
}
class Fifth extends School{
	String classname="5 B";
	String School = "National English Medium";
	int students=36;
	String cteacher="Sangeetha";
	String leader="faseeh bin musthafa";
	int girls=18;
	int boys=18;
	void cdetails() {
		System.out.println(classname);
		System.out.println(students);
		System.out.println(cteacher);
		System.out.println(leader);
		System.out.println(girls);
		System.out.println(boys);
	}
	void schoolname(){
		System.out.println(School);
	}
	void Details() {
		cdetails();
		super.schoolname();
	}
}
public class Super2 {
 public static void main(String[] args) {
	Fifth f1=new Fifth();
	f1.Details();		
}
}
