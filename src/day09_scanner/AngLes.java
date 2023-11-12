package day09_scanner;
import java.util.Scanner;

public class AngLes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("The angles make a triangle");
        double angles1 = input.nextFloat();
        System.out.println("The angles make a a circle");
        double angles2 = input.nextFloat();

        boolean triagle= (angles1 + angles2)<=180;
        System.out.println("If the angles make a triangle " +triagle);

        System.out.println( "If the angles make a circle " + triagle);
        boolean circle = (angles1 + angles2)>=360;




    }
}
