import java.util.Scanner;

public class scanner_charat {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //considers only char at that position
        char a = sc.next().charAt(0);
        System.out.println("name is" + a);
        String name = "ram";
        System.out.println(name.charAt(1));
    }
}
