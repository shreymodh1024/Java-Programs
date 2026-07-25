package Linear_Equation_Solution;

import java.util.Scanner;

public class InTwoVariables {
    static float[][] matrix = new float[3][4];
    static float x, y;

    public static void main(String[] args) {
        inputAndDescription();
        calculation();
    }

     static void calculation() {
         //step 1: making a11 = 1
         float a11 = matrix[0][0];
         for(int j = 0; j <= 2; j++){
             matrix[0][j] = matrix[0][j] / a11;
         }


         //step 2: making a21 = 0
         float a21 = matrix[1][0];
         for(int j = 0; j <= 2; j++){
             matrix[1][j] = (-1) * a21 * matrix[0][j] + matrix[1][j];
         }


         //step 3: getting y & x
         y = matrix[1][2] / matrix[1][1];
         x = matrix[0][2] - matrix[0][1] * y;

         System.out.println("\nx = "+ x + "\ny= "+ y);


    }

    static void inputAndDescription() {
        Scanner sc = new Scanner(System.in);
         System.out.println("=============================================================================");
         System.out.println("The equation is in form :- \na1(x) + b1(y) = c1 \na2(x) + b2(y) = c2");
         System.out.print("a1 = " ); matrix[0][0] = sc.nextFloat();
         System.out.print("b1 = " ); matrix[0][1] = sc.nextFloat();
         System.out.print("c1 = " ); matrix[0][2] = sc.nextFloat();
         System.out.print("a2 = " ); matrix[1][0] = sc.nextFloat();
         System.out.print("b2 = " ); matrix[1][1] = sc.nextFloat();
         System.out.print("c2 = " ); matrix[1][2] = sc.nextFloat();




    }
}
