package Day14_if_statements;

import java.util.Scanner;

public class InvalidAge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Which age group you belong?");
        int age = input.nextInt();
        int age1 =50;

        String result = "";

            if(age == 0 && age>2){
                result = "Baby";
            }else if(age>3 && age<=5){
                result = "Toddler";
            }else if(age>6 && age<9){
                result = "Kid";
            }else if(age>13 &&age<17){
                result ="Teenager";
            }else if(age>18 && age<20){
                result="Young Adult";
            }else if(age>=21 && age<=35){
                result= "Adult";
            }else if(age>=36 && age<=55){
                result = "Middle - Aged Adult";
            }else if (age== 55&& age>55){
                result = "Senior Citizen";
                System.out.println("Your age group is: " + result);
            }else{

                System.out.println("Invalid age");
            }


        }



    }



