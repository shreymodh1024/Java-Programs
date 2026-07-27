import java.awt.*;
import java.util.Date;

//SOME MORE DATATYPES (PRIMITIVE AS WELL AS NON-PRIMITIVE)
public class Date_Point_and_byte_datatypes {
    static void main() {
        byte a = 33; //a = 33333 is an error
        int b = 3;
        System.out.println(a+b);
        Date date = new Date();
        System.out.println(date);

        //POINTS
        Point p1 = new Point(10,20);
        Point p2 = p1; //--1
        System.out.println(p1.x + " : " + p1.y);
        System.out.println(p2.x + " : " + p2.y);
        p1.y = 25; //value of p1.y changed
        System.out.println(p1.x + " : " + p1.y);
        System.out.println(p2.x + " : " + p2.y);
       /*
       yet it can be observed that value of p2.y also changed
       why?
       because you have copied the reference, not the value @ 1
       so when the value gets changed to a particular reference, it's changed for
       wherever the reference is being copied
         */

        int g = 34;
        int h = g;
        System.out.println("g is "+g);
        System.out.println("h is "+h);
        g = 40;
        // even after changing g, h did not change as it stores value
        System.out.println("h now is "+h);

    }
}
