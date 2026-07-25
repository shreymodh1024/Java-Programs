package Exception_Handling;


import java.util.Scanner;

public class class_problem1 {
    public static void main(String[] args) {

        try{
            input();
            System.out.println("good job sir.");
        } catch (Exception e){
            System.out.println("please allocate unique integers");
        }
    }

    static void input() throws Exception{

        Scanner in = new Scanner(System.in);
        System.out.print("No. of Integers to list: ");
        int n = in.nextInt();
        System.out.println("enter the numbers:");

        //taking, verifying and storing elements
        int list[] = new int[n];
        for(int i = 0; i< list.length; i++){
            list[i] = in.nextInt();
            for(int j = 0; j < i; j++){
                if(list[i] == list[j]){
                    throw new Exception();
                }
            }
        }

    }
}