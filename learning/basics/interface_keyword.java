
interface IBDCBankAccount{
    int a = 0;
    void openAccount();
    void closeAccount();
}

interface IBankAccount extends IBDCBankAccount{

    void deposit();
    void withdraw();
    void balance();
}

class saving implements IBankAccount, IBDCBankAccount{
    /* here i can implement multiple interfaces at a same time which was not allowed in case of
    abstract classes
     */

    @Override
   public void deposit() {
        System.out.println("deposit amount");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw amount");
    }

    @Override
    public void balance() {
        System.out.println("your balance sheet");
    }

    @Override
    public void openAccount() {
        System.out.println("openAccount");
    }

    @Override
    public void closeAccount() {
        System.out.println("closeAccount");
    }
}

public class interface_keyword {
    static void main() {
        /* IBankAccount i = new IBankAccount();
        interfaces can also not be instantiated
         */

        saving s = new saving();
        s.balance(); s.openAccount();
    }
}