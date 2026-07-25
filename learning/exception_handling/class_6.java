package Exception_Handling;

public class class_6 {
    public static void main(String[] args) throws Exception {
        try{
            throw new ArithmeticException();
        } catch (RuntimeException e){
            System.out.println("Handled");
        }
    }
}
