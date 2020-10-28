 import java.util.Scanner;
 
 class Address {  
    String city,state,country;  
      
    public Address(String city, String state, String country) {  
        this.city = city;  
        this.state = state;  
        this.country = country;  
    }  
      
    }  



    public class Aggregation {  
        int id;  
        String name;  
        Address address;  
          
        public Aggregation(int id, String name,Address address) {  
            this.id = id;  
            this.name = name;  
            this.address=address;  
        }  
          
        void display(){  
        System.out.println(id+" "+name);  
        System.out.println(address.city+" "+address.state+" "+address.country);  
        }  
          
        public static void main(String[] args) { 
            int a;
            String n,m,t,s,c;
            Scanner sc =new Scanner (System.in);
            System.out.println("Enter the ID: ");
             a=sc.nextInt();
            System.out.println("Enter the Name: ");
             n=sc.next();
            System.out.println("Enter the country: ");
             c=sc.nextLine();
             System.out.println("Enter the Town: ");
             t=sc.nextLine();
             System.out.println("Enter the State: ");
             s=sc.nextLine();
           
        Address address1=new Address(t,s,c);  
        Address address2=new Address(t,s,c);  
          
        Aggregation e=new Aggregation(a,n,address1);  
        Aggregation e2=new Aggregation(a,n,address2);  
              
        e.display();  
        e2.display();  
              
        }  
          
}
