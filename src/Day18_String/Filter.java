package Day18_String;

import java.util.Locale;
import java.util.Scanner;

public class Filter {
    public static void main(String [] args){
        //Scanner input = new Scanner (System.in);
       // System.out.println("Enter a message");
       // String msg=input.nextLine();
       // msg=msg.trim();
       // msg=msg.toLowerCase();

      //  if(msg.contains("java is bad") || msg.contains("quit") || msg.contains("have fun") || msg.contains("crying")){
      //      System.out.println("Message failed to send");
      //  }else{
     //       System.out.println("\"" + msg +  "\"" + " was sent");
     //   }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message");
        String msg =input.nextLine();
        msg = msg.trim();
        msg = msg.toLowerCase();

        if(msg.contains("java is bad") || msg.contains("quit") || msg.contains("have fun") || msg.contains("crying")){
            System.out.println("Message failed to send");
        }else{
            System.out.println("\"" + msg +  "\"" + " was sent");

        }


    }








    }

