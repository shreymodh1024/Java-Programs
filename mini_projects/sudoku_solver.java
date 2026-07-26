import java.util.Scanner;

public class sudoku_solver {

    static void input(int[][] arr){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i< 9; i++){

            if(i == 0) System.out.print("1st row: ");
            if(i == 1) System.out.print("2nd row: ");
            if(i == 2) System.out.print("3rd row: ");
            if(i == 3) System.out.print("4th row: ");
            if(i == 4) System.out.print("5th row: ");
            if(i == 5) System.out.print("6th row: ");
            if(i == 6) System.out.print("7th row: ");
            if(i == 7) System.out.print("8th row: ");
            if(i == 8) System.out.print("9th row: ");

            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


    }

    static void process(int[][] arr){



       //first 2 boxes are for altering boxes
       for(int i = 0; i < 9; i++){
           for(int j = 0; j < 9; j++){
              if(arr[i][j] == 0) {//to check if the box is empty

                  boolean flag = false; //if a box is flagged you cannot assign any value on it

                  //horizontal check
                  for (int k = 0; k < 9; k++) {

                  }

              }
           }
       }

    }
    static void main() {
       int[][] arr = new int[9][9];
       input(arr);

       process(arr);


    }
}
