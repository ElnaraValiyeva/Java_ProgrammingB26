package day62_maps;

import java.sql.SQLOutput;
import java.util.Arrays;

public class UseElla {

    public static void main(String[] args) {
         Ella  ella = Ella.Sunday;
        System.out.println(ella);

        Ella []  ellas = Ella.values();
        System.out.println(Arrays.toString(ellas));

        System.out.println("-------------");
        switch(ella){
            case Monday:
                System.out.println("Monday");
                break;
            case Tuesday:
                System.out.println("Tuesday");
                break;
            case Wednesday:
                System.out.println("Wednesday");
                break;
            case Thursday:
                System.out.println("Thursday");
                break;
            case Friday:
                System.out.println("Friday");
                break;
            case Saturday:
                System.out.println("Saturday");
                break;
            case Sunday:
                System.out.println("Sunday");
                break;
            default:
        }

    }
}
