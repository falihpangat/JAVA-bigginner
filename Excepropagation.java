public class Excepropagation {
    void m(){
        int data= 50/0;
    }
    void n(){
        m();
    }
    void p(){
        try {
            n();
        } catch (ArithmeticException e) {
        
            System.out.println("exception handled");
        }
        
    }
    public static void main(String[] args) {
        Excepropagation obj= new Excepropagation();
        obj.p();
        System.out.println("normal flow hooooo.....");
    }
}
