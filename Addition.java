import java.util.Scanner;
public class Addition {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the first number");
       int a = sc.nextInt();
       System.out.println("enter the second number");
       int b = sc.nextInt();

       int c = add(a,b);
       System.out.println("the sum of the a nad b is= "+ c);

   } 
   public static int add(int n1,int n2){
       int s;
       s= n1 + n2;
       return s;
   }
}
