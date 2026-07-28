class a{
     void main1() {
        System.out.println("inside a");
    }
}

class b extends a{
     void main2() {
        System.out.println("inside b");
    }
}

public class upcasting_downcasting {
    static void main() {
        double num = 4.5;
        //int num2 = num;
        // this code gives an error. so we explicitly typecast it
        int num2 = (int) num;
        System.out.println(num2);

        //similarly,
        b obj = new b(); //child class
        a obj2 = (a) obj; //child class 'b' typecasted to parent class 'a'
        //I can also write it as a obj2 = (a) new b(); or = new b();
        /* this is upcasting. due to this casting, variables and methods of only class a is accessible*/
        obj2.main1();
        //obj2.main2(); --> it's an error. but we'll find a way. see below how.

        //next, let
        //b obj3 = (b) new a(); this is not possible. but,
        b obj4 = (b) obj2;
        //here, parent class obj2 is being downcasted to child class obj4
        //this is downcasting.
        obj4.main2();


    }
}