import java.util.Random;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Random random = new Random();
        String sample_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                                "abcdefghijklmnopqrstuvwxyz" +
                                "1234567890" +
                                "!@#$%^&*?";

        Scanner sc = new Scanner(System.in);
        System.out.print("Length of password you want: ");
        int len = sc.nextInt();
        String password = "";

        for(int i = 1; i <= len; i++){
            password = password + sample_letters.charAt(random.nextInt(sample_letters.length()));
        }
        System.out.println("password: "+ password);

    }
}
