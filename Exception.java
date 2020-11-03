public class Exception{
    static void validate(int age){
        if(age<18)
        throw new ArithmeticException("not valid");
        else{
            System.out.println("Welcome to vote");
        
        }
    }
   public static void main(String[] args) {
       validate(20);
       System.out.println("rest of the code");
   } 
}