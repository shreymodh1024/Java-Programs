abstract class abc_bank{
    int a;
    abstract void a();
}

abstract class BankAccount extends abc_bank{
    abstract void deposit();
    abstract void withdraw();
    abstract void balance();
    public void x(){
        System.out.println("hello");
    }
}

class savingAccount extends BankAccount{

    @Override
    void deposit() {
        System.out.println("deposit amount");
    }

    @Override
    void withdraw() {
        System.out.println("withdraw amount");
    }

    @Override
    void balance() {
        System.out.println("your balance sheet");
    }

    @Override
    void a() {
        System.out.println("welcome to abc bank");
    }
}

//class currAccount extends BankAccount{
//
//    @Override
//    void deposit() {
//        System.out.println("current deposit");
//    }
//
//    @Override
//    void withdraw() {
//        System.out.println("curr withdraw");
//    }
//
//    @Override
//    void balance() {
//        System.out.println("curr balance");
//    }
//}

public class abstract_keyword {
    static void main() {
        /* abc_bank abc = new abc_bank();
        this is an error because you cannot create or implement an abstract class
         */
        savingAccount s = new savingAccount();
        s.a();
        s.deposit();

    }
}