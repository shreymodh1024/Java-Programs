import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz_service {

    static void main() {
        ArrayList<String> players = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("start entering names and type 'done' when all names are given.");
        int no_of_students = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print( "user "+ i+": ");
            String player = sc.next();
            if (!player.equals("done")){ players.add(player); }
            else{
                no_of_students = i-1;
                break;
            }
        }

        for (){
            for (int )
        }


    }
}
