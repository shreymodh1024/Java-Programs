package Exception_Handling;

public class class_1 {
    public static void main(String[] args) {
        try{
            level3();
           level1();

    }
    catch (Exception o){
            StackTraceElement[] stack_trace = o.getStackTrace();
       for(StackTraceElement ele : stack_trace){
           System.out.println(ele);
       }
        }
    }

    static void level1(){
        level2();
    }
    static void level2(){


        level3();
    }
    static void level3(){
            int arr[]= new int[5];
            arr[5] = 10;
    }
}

//STACK TRACE ELEMENT
