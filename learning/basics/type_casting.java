public class type_casting {
    static void main() {
        //IMPLICIT TYPE CASTING
        byte a = 2;
        //implicit type casting from byte to int
        int b = a;
        //implicit type casting from int to float
        float c = b;
        System.out.println(a+"\n"+b+"\n"+c);


        //EXPLICIT TYPE CASTING
        double d = 23.223;
        int e = (int)d;
        //this is explicit type casting of double to int
        System.out.println(e);

       /*
        String f = "hey_thereeee";

        int g = (int)f;
        System.out.println(f);
        it's an error!
        */
    }
}
