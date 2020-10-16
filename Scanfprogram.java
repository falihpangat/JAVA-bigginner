import java.util.Scanner;

public class Scanfprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.nextLine();
        System.out.println("enter the Gender");
        char gender = sc.next().charAt(0);
        System.out.println("enter the Age");
        int age = sc.nextInt();
        System.out.println("enter the MobileNo");
        long mobileNo = sc.nextLong();
        System.out.println("enter the CGPA");
        double CGPA =sc.nextDouble();

        System.out.println("Name: "+name);
        System.out.println("gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile: "+mobileNo);
        System.out.println("CGPA: "+CGPA);
    }
}
