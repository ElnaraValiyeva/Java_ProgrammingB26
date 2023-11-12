package Day14_if_statements;

import java.util.Scanner;

public class MovieCost {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How much movie is cost");
        double duration = input.nextDouble();
        String price="";

        if(duration<=0&&duration==0){
            System.out.println("Movies cannot be less than 0 minutes");
        }if(duration>=4){
            System.out.println("Movies cannot be more than 4 hours");
        }else if (duration==1.0){
            price="8.99";
        }else if(duration==1.5){
            price="10.50";
        }else if(duration==2.0){
            price="12.99";

        }else if (duration==2.5){
            price="14.50";
        }else if (duration==3&&duration==3.5&& duration==4){
            price="15.99";
        }
        System.out.println(price);




    }
}
