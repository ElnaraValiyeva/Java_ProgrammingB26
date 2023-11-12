package day11_if_statememnts;

import java.sql.SQLOutput;

public class IfElseExample {
    public static void main(String[] args) {

        int score =50;
        if(score >=75){
            System.out.println("Passing");
        } else {
            System.out.println("Failing");
        }
        int year=2021;
        boolean lockdown = year ==2020 || year ==2021;

        if(lockdown){
            System.out.println("Stay at home");
            System.out.println("Still practice java");
        } else{
            System.out.println("Stay at home");
            System.out.println("Still practice java");

        }

        int a =1;
        a=-1+ 0/1*(-1);
        a=-1;





    }

}
