package Day3_Arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String s ="monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        String [] days = s.split(",");
        System.out.println(Arrays.toString(days));

        for( String day : days){
            System.out.println(day);
        }
        System.out.println();

        String [] withOutDay = s.split("day");

        for(String each: withOutDay){
            System.out.println(each);
        }
        System.out.println();
        String str = "Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";

        String [] month = str.split("-");

        for(String each : month){
            System.out.println(each);
        }

    }
}
