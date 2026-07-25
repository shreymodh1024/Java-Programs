package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class class_5 {
    public static void main(String[] args) throws IOException {

        System.out.println(divide(23, 33));
    }

    static double divide(double a, double b){
        try{return a/b;}
        catch (ArithmeticException e){
            System.out.println(e);
            return -1;
        }
        finally{
            System.out.println("bye");
        }
    }
}

//use of finally
