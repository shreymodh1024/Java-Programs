import java.util.Random;
import java.util.Scanner;

public class rockPaperScissor {static Scanner sc = new Scanner(System.in);

    static void playRPS(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Hi I'm Computer. Let's play!\n:>\n");
        for(int i =1; i<=100; i++){
            System.out.print("1.Rock...  2.Paper...  3.Scissor...\n");
           int input = sc.nextInt();
           switch(input){
            case 1 : System.out.print("Me: Rock , "); break;
            case 2 : System.out.print("Me: Paper , "); break;
            case 3 : System.out.print("Me: Scissor , "); break;
            default: System.out.println("Invalid Number"); return; 
           }
           Random random = new Random(); int comp = random.nextInt(1,4);
            switch(comp){
            case 1 : System.out.println("Comp: Rock  "); break;
            case 2 : System.out.println("Comp: Paper "); break;
            case 3 : System.out.println("Comp: Scissor  "); break;
           }
           if(input==comp){System.out.println("TIE\n");}
           else if(input==1&&comp==3|| input==2&&comp==1||input==3&&comp==2){System.out.println("YOU WIN\n");}
           else if(input==1&&comp==2||input==2&&comp==3||input==3&&comp==1){System.out.println("COMPUTER WINS\n");}
        }
    }
    public static void main(String[] args) {
       
        playRPS();
    }
}
