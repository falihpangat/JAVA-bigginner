import java.util.Scanner;

public class Addtwonumber{
    public static void main(String[] args) {
        int sum ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numer A");
        int A = sc.nextInt();
        System.out.println("enter the number B");
        int B = sc.nextInt();
        sum = A + B;
        System.out.println("the sum of A and B is :" + sum);
       

    }
}