/* this program is based on a child game fizzbuzz.
* here the program takes input of names of players,
* and decides what a particular player will answer in all his next turns
* provided no player has got eliminated until then */


import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz_service {

    static void main() {
        ArrayList<String> players = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //input in arraylist
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

        //getting all answers in a bunch
        String[] arr = new String[100];
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                arr[i] = "FizzBuzz";
            }
            else if (i%3 == 0) {
                arr[i] = "Fizz";
            }
            else if (i % 5 == 0) {
                arr[i] = "Buzz";
            }
            else{
                arr[i] = String.valueOf(i);
            }
        }

        


    }
}
