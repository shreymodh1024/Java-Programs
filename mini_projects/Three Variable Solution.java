package Linear_Equation_Solution;

import java.util.Scanner;

public class InThreeVariables {
    static float[][] matrix = new float[3][4];
    static float x, y, z;

    public static void main(String[] args) {
        inputAndDescription();
        calculation();
    }

    static void calculation() {
        //step 1: making a11 = 1
        float a11 = matrix[0][0];
        for(int j = 0; j <= 3; j++){
            matrix[0][j] /= a11;
        }


        //step 2: making a21 and a31 = 0
        float a21 = matrix[1][0];
        for(int j = 0; j <= 3; j++){
            matrix[1][j] = (-1) * a21 * matrix[0][j] + matrix[1][j];
        }
        float a31 = matrix[2][0];
        for(int j = 0; j <= 3; j++){
            matrix[2][j] = (-1) * a31 * matrix[0][j] + matrix[2][j];
        }

        //step 3: making a22 = 1
        if(matrix[1][1] == 0){
            for(int j = 0; j <= 3; j++){
                float temp = matrix[1][j];
                matrix[1][j] = matrix[2][j];
                matrix[2][j] = temp;
            }
        }
        float a22 = matrix[1][1];
        for(int j = 0; j <= 3; j++){
            matrix[1][j] /= a22;
        }

        //step 4: making a32 = 0
        float a32 = matrix[2][1];
        for(int j = 0; j <= 3; j++){
            matrix[2][j] = (-1) * a32 * matrix[1][j] + matrix[2][j];
        }



        //step 3: getting z & y & x
        z = matrix[2][3] / matrix[2][2];
        y = matrix[1][3] - matrix[1][2] * z;
        x = matrix[0][3] - (matrix[0][1] * y + matrix[0][2] * z);

        System.out.println("\nx = "+ x + "\ny = "+ y + "\nz = "+z);


    }

    static void inputAndDescription() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================================================");
        System.out.println(
                "The equation is in form :- \n" +
                        "a11(x) + a12(y) + a13(z) = a14 \n" +
                        "a21(x) + a22(y) + a23(z) = a24 \n"+
                        "a31(x) + a32(y) + a33(z) = a34\n"
        );
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 4; j++){
                System.out.print("a"+i+j+ " = "); matrix[i-1][j-1] = sc.nextFloat();
            }
            System.out.println();
        }



    }
}

