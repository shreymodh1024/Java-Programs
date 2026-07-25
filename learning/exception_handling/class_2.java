package Exception_Handling;

import java.io.FileReader;
import java.io.IOException;

public class class_2 {
    public static void main(String[] args) {

        try{
            FileReader fr = new FileReader("a.txt");
        }
        catch (IOException e){
            System.out.println("file not found");
        }
    }
}


/*Two types of exception: 1. checked, 2. unchecked
* 1. Checked exceptions occur during compile time
* 2. unchecked during runtime*/