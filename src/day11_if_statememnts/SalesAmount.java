package day11_if_statememnts;
 import java.sql.SQLOutput;
 import java.util.Scanner;

 public class SalesAmount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your sale amount?");
        double salesAmount=scan.nextDouble();

        if(salesAmount<10000){
            System.out.println("Sorry! You don't get any bonus");

        }else if (salesAmount>10000 && salesAmount<15000){
            System.out.println("You will get a bonus of 5000");

        }else {
            System.out.println("You will get bonus of 7000");
        }




    }
}
