class constructor_chaining_2{
    int num;
    String name;
    double marks;

    constructor_chaining_2(){}

    constructor_chaining_2(int num){this.num = num;}

    constructor_chaining_2(String name){this.name = name;}

    constructor_chaining_2(double marks){this.marks = marks;}

    constructor_chaining_2(int num, String name){
        this(num);
        this.name = name;
    }

    constructor_chaining_2(int num, double marks){
        this(num);
        this.marks = marks;
    }


}

public class constructor_chain_2 {
    static void main() {

    }
}