import java.util.Scanner;
class CarInfo{String model; double priceInLac; int enginePower; int torque;
CarInfo(){}
CarInfo(String a, double b, int c, int d){model = a; priceInLac = b; enginePower = c; torque=d;}
void carSpecification(){
System.out.println("--> model: "+model+"\n--> price(in Lac): "+priceInLac+"\n--> Engine Power(in cc): "+enginePower+"\n--> Torque(in Nm): "+torque+"\n");}
}

public class Car_Information {static Scanner sc = new Scanner(System.in);
    static CarInfo c2 = new CarInfo("Maruti Dzire", 9.31, 1197, 101);
    static  CarInfo c3 = new CarInfo("Toyota Innova", 25.27, 2393, 343);
    static CarInfo c4 = new CarInfo("Mahindra Thar", 16.99, 120, 310);
    static CarInfo c1 = new CarInfo();
    
//..........................................................................................................................................
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
//..................................................................................................................................
    static void NewCar(){ 
        System.out.println("---------------------------------------------------------------------------------------------------------------\n");
      System.out.println("write null or 0 if no info available");
      System.out.print("model: ");  c1.model = sc.next();
      System.out.print("price(in Lakhs): "); c1.priceInLac= sc.nextDouble();
      System.out.print("engine Power(in cc): "); c1.enginePower= sc.nextInt();
      System.out.print("torque(in Nm): "); c1.torque= sc.nextInt();
        System.out.println("                 Saved Successfully!\n");
        System.out.println("1. Home, 2. Exit, 3. Display car, 4. contactDetails\n");

        int button = sc.nextInt();
         switch (button) {
            case 1: homePage(); break;
            case 2: exit(); break;
            case 3: carDisplay(); break;
            case 4: contactDetails(); break;
            
            default:System.out.println("you've not chosen any option. So exited by default. HAVE A NICE DAY"); break;
         }
    }
//........................................................................................................................................    
    static void carDisplay(){ System.out.println("---------------------------------------------------------------------------------------------------------------\n");
        System.out.println("Here are the list of available cars:\n");
        System.out.println("1. "+c2.model+"\n2. "+c3.model+"\n3. "+c4.model+"\n4. "+c1.model+"\nyou can choose the car to see specifications\n");

        int button = sc.nextInt();
         switch (button) {
            case 1: c2.carSpecification(); break;
            case 2: c3.carSpecification(); break;
            case 3: c4.carSpecification(); break;
            case 4: c1.carSpecification(); break;
            case 5: homePage(); break;
            
                default:carDisplay(); break;}

            System.out.println("1. Home, 2. Exit, 3. New Car Entry, 4. contactDetails\n");

        int button2 = sc.nextInt();
         switch (button2) {
            case 1: homePage(); break;
            case 2: exit(); break;
            case 3: NewCar(); break;
            case 4: contactDetails(); break;
            
            default:System.out.println("you've not chosen any option. So exited by default. HAVE A NICE DAY"); break;
         }
         }        
    
    static void contactDetails(){System.out.println("-------------------------------------------------------------------------------------------------------------\n");
        System.out.println("INQUIRE NOW!\nat 6354075497\n\n1.Home, 2.Exit\n");
        int button = sc.nextInt();
        switch (button) {
           case 1 : homePage(); break; case 2: exit();break;  default : exit(); break;
        }
    }
    static void exit(){System.out.println("Comeback soon! HAVE A NICE DAY!");}
    public static void main(String[] args) {
          homePage();

    }
}
