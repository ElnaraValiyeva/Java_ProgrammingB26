package Day18_String;

import java.util.Locale;
import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Enter the URL");
        String url = input.next();

        boolean validStart = url.startsWith("www.");
        boolean validEnd = url.endsWith(".com")|| url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith(".net");

        if(validStart && validEnd){
            System.out.println(url + " is a valid website");
        }else{

            if(!validStart){
                System.out.println("url needs to star with www.");
            }

            if(!validEnd){
                System.out.println("url needs to end with .com or .edu or .net or .gov");
            }
        }









        }








    }

