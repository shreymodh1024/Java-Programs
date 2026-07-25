package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class class_4 {
    public static void main(String[] args) throws FileNotFoundException {
        method1();

    }

    static void method1() throws FileNotFoundException {
        try {
            FileReader fr = new FileReader("a.txt");
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    static void method2() throws FileNotFoundException {
        method1();
    }
}

//use of Throws.
//correct it, or DECLARE it
//you can forcefully throw unchecked exceptions of your choice
