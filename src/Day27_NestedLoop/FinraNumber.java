package Day27_NestedLoop;

import java.util.Scanner;

public class FinraNumber {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("enter your stopping point");
        int stop = input.nextInt();

        for( int i = 1; i <= stop; i++){

            String str = "";

            if(i % 3 == 0){
                str += "FIN";
            }

            if (i % 5 == 0) {

                str += "RA";
            }
            System.out.print (str.isEmpty()? i: str + " ");
        }
    }
}
