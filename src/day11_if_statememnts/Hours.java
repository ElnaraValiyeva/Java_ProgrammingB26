package day11_if_statememnts;

import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Time of the Day ");
            int time = input.nextInt();
            if(time >= 6 && time < 11){
                System.out.println("Good morning!");
            }else if(time >= 12 && time < 16){
                System.out.println("Good evening!");
            } else if(time >= 17 && time < 23) {
                System.out.println("Good night!");
            }else
                System.out.println("Sleeping time");
            }

    }

