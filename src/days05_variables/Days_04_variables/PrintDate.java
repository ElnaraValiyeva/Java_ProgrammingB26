package days05_variables.Days_04_variables;

public class PrintDate {
    public static void main(String[] args) {


        /*
        Task:
        declare and assign 3 variables
        the month number, the day number, and number

        print the date in the following format:
        month/day/year
        */
//       sytem.out.println (032)

        int month  = 2;
        int day = 5;
        int year = 2022;

        System.out.println(month + "/" + day + "/" + year);
        System.out.println(month + "-" + day + "-" + year);
        System.out.println(month + "|" + day + "|" + year);
        System.out.println(month + "<>" + day + "<>" + year);
    }
}
