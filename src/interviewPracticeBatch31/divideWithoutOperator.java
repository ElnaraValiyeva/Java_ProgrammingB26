package interviewPracticeBatch31;

import java.util.Scanner;

public class divideWithoutOperator {
    /**
     *Write a method that can divide two numbers without using division operator
      10/5=2
     */

    public static void main(String[] args) {

      //  int a,b,c, result=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number");
        int  a= scan.nextInt();
        System.out.println("Enter second number");
        int  b = scan.nextInt();
        int count =0;

        while(a >= b){
            a=a-b;
            count++;
        }
        System.out.println("The result is: " + count);



    }
}
