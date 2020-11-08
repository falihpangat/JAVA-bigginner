class Name{
	int id;
	String name;
	
	void insert(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
	}
}
class Linkedlist{
	public static void main(String[] args) {
		Name s1=new Name();
		
		s1.insert(001, "falihpangat");
		s1.display();
	}
}