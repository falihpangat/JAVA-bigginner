import java.util.Scanner;

class Checkevenodd {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the Integer number: ");
        //the input is stored in num//
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        /*if the number is devisible by 2 then its an even number
        else odd number
        */
        
        if ( num % 2 == 0)
        System.out.println("Enter number is even");
        else
           System.out.println("the number is odd");
    }
}
