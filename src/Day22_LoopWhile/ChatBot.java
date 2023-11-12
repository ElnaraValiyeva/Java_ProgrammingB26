package Day22_LoopWhile;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        boolean keepTalking = true;

        while(keepTalking){

            System.out.println("Enter a message");
            String msg = input.nextLine();

            switch(msg){

                case "hello":
                    System.out.println("Hi");
                    break;
                case "how are you":
                    System.out.println("Iam good");
                    break;
                case "bye":
                    System.out.println("No, dont leave");
                    keepTalking = false;
                    break;
                default:
                    System.out.println("I dont know what you said");
            }
        }
    }
}
