package Day14_if_statements;

import java.util.Scanner;

public class MinutesVariabl {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How much time is lefy in the soccer game");
        int minutes= input.nextInt();
        String print="";

         if(minutes<=0 && minutes>=90){
             print = "Not valid";
         } if(minutes<=0){
             print= "Minutes cannot be a negative number";
        } else if(minutes>=90){
             print="Games cannot be longer than 90 minutes";
        }else if(minutes>=75 &&minutes<=90){
             print="Just getting started";
        }else if(minutes>=74 && minutes<=60){
             print="Players are doing their best";
        }else if(minutes>=30 && minutes<59){
             print="Middle of the game is going great";
        }else if(minutes >=0 && minutes<=29){
             print="The end of the same is approaching";
        }
        System.out.println(print);

    }
}
