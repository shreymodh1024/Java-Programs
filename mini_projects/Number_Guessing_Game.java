//NUMBER GUESSING GAME

import java.util.Random;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int rand_num = random.nextInt(1,101);


        for(int counts = 1; counts <= 100; counts++){
            System.out.print("\nGuess The Number: ");
            int user_num = sc.nextInt();
            if(user_num == rand_num){
                System.out.println("Congratulations you guessed right in "+counts+" attempts");
                break;
            }
            System.out.println(user_num > rand_num ?
                    "Your number is too high.":
                     "Your number is too low");
        }
    }
}
