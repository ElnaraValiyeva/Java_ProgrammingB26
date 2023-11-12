package Day14_if_statements;

import java.util.Scanner;

public class RealState {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("What is your budget?");
        int budgetPrice = input.nextInt();
        boolean isavaliable=false;

        if(budgetPrice>=50_000 && budgetPrice<=90_000){
            System.out.println("Name: Hills\n Average price - 80.000 - 100.000\n Rating - 4.0\n  Gated - no\n Allow pets -yes");
        }else if(budgetPrice>=50_000 && budgetPrice<=80_000 ){
            System.out.println("Name - Oaks\n Average price - 80000- 100000\n Rating - 4.0\n gated - no\n Allow pets - true\n Name - Highland");
        } else if(budgetPrice>=1000_00 && budgetPrice<=1500_00){
            System.out.println("Average price - 120,000 - 150,000\n Rating - 4.5\n Gated - yes\n Allow pets - no");
        }else if (budgetPrice>=130_000&&budgetPrice<=250_000){
            System.out.println("Name - Canyon\n Average price - 160,000 -150,000\n Rating - 4.8\n gated - yes\n Allow pets - yes");
        }else
            System.out.println("No available houses");
             isavaliable=false;
        }


    {

    }

}




