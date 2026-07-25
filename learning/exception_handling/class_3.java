package Exception_Handling;

class Student{
    String name;
    private String ID;
    int marks1 = 0;

    void set(String input){
        ID = input;
    }
    String get(){
        return ID;
    }

    void display(){
        System.out.println("Exception_Handling.Student Details:-\n\nNAME: "+ name+
                "\nID: "+ID+
                "\nmarks: "+marks1);
    }
}

public class class_3 {


    public static void main(String[] args) {

        Student s1 = new Student();
        s1.set("xyz224");
        s1.name = "Garry Kasparov";
        s1.marks1 = 33;
        s1.display();

    }
}
