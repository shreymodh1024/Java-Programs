import java.util.Scanner;
class CarInfo{String model; double priceInLac; double enginePower; double torque; CarInfo next;
    CarInfo(){}
    CarInfo(String a, double b, double c, double d){model = a; priceInLac = b; enginePower = c; torque=d;}
    void carSpecification(){
        System.out.println("--> model: "+model+"\n--> price(in Lac): "+priceInLac+"\n--> Engine Power(in cc): "+enginePower+"\n--> Torque(in Nm): "+torque+"\n");}
}

//linked list
class Linkedlis{
    CarInfo tail;

    //inserting node at end
    void addAtEnd(CarInfo input){
        CarInfo Node = input;
        if(tail==null){ tail = Node; return;}
        tail.next = Node;
        tail = Node;

    }
}


public class main2 {
    static Linkedlis ll = new Linkedlis();
    static Scanner sc = new Scanner(System.in);
    static CarInfo c2 = new CarInfo("Maruti Dzire", 9.31, 1197.444, 101);
    static  CarInfo c3 = new CarInfo("Toyota Innova", 25.27, 2393, 343);
    static CarInfo c4 = new CarInfo("Mahindra Thar", 16.99, 120, 310);

    //  static CarInfo c1 = new CarInfo();


    //Home page
    static void homePage(){
        System.out.print("---------------------------------------------------------------------------------------------------------------\n:-D");
        System.out.println(" WELCOME TO XYZ CAR_INFO\n    pls select your option no.\n");
        System.out.println("1. New Car Entry\n2. Display Cars\n3. Contact details\n4. Exit\n");
        //System.out.println("---------------------------------------------------------------------------------------------------------------\n");

        int button = sc.nextInt();
        switch (button) {
            case 1: NewCar();break;
            case 2: carDisplay(); break;
            case 3: contactDetails(); break;
            case 4: exit(); break;


            default:System.out.println("you've not chosen any option. So exited by default. HAVE A NICE DAY"); break;
        }
    }


    //New car
    static void NewCar(){
        CarInfo c1 = new CarInfo();
        ll.addAtEnd(c1);
        System.out.println("---------------------------------------------------------------------------------------------------------------\n");

        System.out.println("write null or 0 if no info available");
        System.out.print("model: ");  c1.model = sc.next();
        System.out.print("price(in Lakhs): "); c1.priceInLac= sc.nextDouble();
        System.out.print("engine Power(in cc): "); c1.enginePower= sc.nextDouble();
        System.out.print("torque(in Nm): "); c1.torque= sc.nextDouble();


        System.out.println("                 Saved Successfully!\n");
        System.out.println("1. Home, 2. Exit, 3. Display car, 4. contactDetails, 5. New Entry\n");

        int button = sc.nextInt();
        switch (button) {
            case 1: homePage(); break;
            case 2: exit(); break;
            case 3: carDisplay(); break;
            case 4: contactDetails(); break;
            case 5: NewCar();break;

            default:System.out.println("you've not chosen any option. So exited by default. HAVE A NICE DAY"); break;
        }
    }


    //car display
    static void carDisplay(){
        System.out.println("-----------------------------------------------------------------------------------------------\n");
        System.out.println("here are the list of available cars:");
        CarInfo temp = c2; int i = 1;
        while(temp!= null){
            System.out.println(i+". "+temp.model);
            temp= temp.next; i++;
        }
        temp = c2; i=1;
        System.out.print("you can choose car to see specifications: ");
        int input = sc.nextInt();
        while(i<input){
            temp= temp.next;
            i++;
        }
        temp.carSpecification();



        System.out.println("\n1. Home, 2. Exit, 3. New Car Entry, 4. contactDetails\n");

        int button2 = sc.nextInt();
        switch (button2) {
            case 1: homePage(); break;
            case 2: exit(); break;
            case 3: NewCar(); break;
            case 4: contactDetails(); break;

            default:System.out.println("you've not chosen any option. So exited by default. HAVE A NICE DAY"); break;
        }
    }


    // contact details
    static void contactDetails(){System.out.println("-------------------------------------------------------------------------------------------------------------\n");
        System.out.println("INQUIRE NOW!\nat 6354075497\n\n1.Home, 2.Exit\n");
        int button = sc.nextInt();
        switch (button) {
            case 1 : homePage(); break; case 2: exit();break;  default : exit(); break;
        }
    }

    //exit button
    static void exit(){System.out.println("Comeback soon! HAVE A NICE DAY!");}
    public static void main(String[] args) {

        ll.addAtEnd(c2); ll.addAtEnd(c3);ll.addAtEnd(c4);



        homePage();

    }
}
