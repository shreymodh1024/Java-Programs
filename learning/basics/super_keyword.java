
//a is a super class here
class a{

    a(){
        System.out.println("void a constructor");
    }
    a(int x){
        System.out.println("int a constructor "+x);
    }
}

//b is a subclass here
class b extends a{

    b(){
        super(5); //even if you don't write it, this method is always there.
        System.out.println("void b constructor");
    }
    b(int x){
        super(); // means calling void constructor of a super class
        System.out.println("int b constructor "+x);
    }
}

public class super_keyword {
    static void main() {
        b obj = new b(3);
        b obj2 = new b();
        /* when this object is created, you see void a and int b is called.
        it is because there always exist a hidden super(); method
        */

    }
}
