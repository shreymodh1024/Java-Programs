class constructor_chaining{
    int num;
    int age;
    int marks;

    constructor_chaining(){}

    constructor_chaining(int num){
        this.num = num;
    }

    constructor_chaining(int num, int age){
        this(num);
        this.age = age;
    }

    constructor_chaining(int num, int age, int marks){
        this(num, age);
        this.marks = marks;
    }

    void display(){
        System.out.println(
                "num: "+ num+
                        "\nage: "+ age+
                        "\nmarks: "+ marks

        );
    }

}

public class constructor_chain {
    static void main() {
     constructor_chaining cc = new constructor_chaining();
     cc.display();

    }
}
