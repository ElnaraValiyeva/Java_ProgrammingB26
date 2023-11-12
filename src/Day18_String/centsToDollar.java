package Day18_String;

import java.util.Scanner;

public class centsToDollar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents");
        int answer = scan.nextInt();
        scan.close();

        int change = answer%100,
              dollars = answer/100;

        String result = (answer + " cents is equal to: " + dollars + "dollars " + change + "cents ");
        System.out.println(result);






    }
}
