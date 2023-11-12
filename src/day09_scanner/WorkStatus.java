package day09_scanner;

import java.util.Scanner;

public class WorkStatus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name=input.next();
        System.out.println("Enter Last name: ");
        String lastname= input.next();
        System.out.println("Are you employed");
        boolean isEmployed=input.nextBoolean();
        System.out.println("Are you a student");
        boolean isStudent = input.nextBoolean();

        String details = name + " " + lastname + "isemployed: " + isStudent  + "they are a student" + isStudent;
        System.out.println(details);








    }
}
