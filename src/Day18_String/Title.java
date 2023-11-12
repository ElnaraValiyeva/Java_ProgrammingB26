package Day18_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please,enter their name including titles");
        String name= input.next().toLowerCase();


        if(name.startsWith("mr") || name.startsWith("mister")){
            System.out.println("Hello Sir");
        }else if(name.startsWith("madam")|| name.startsWith("miss ") || name.startsWith("madam")){
            System.out.println("Hello Ma'am");
        } else if(name.startsWith("dr")){
            System.out.println("hello doktor");
        }
        if(name.startsWith("sr")){
            System.out.println("Nice to meet you Senior");
        }else if(name.startsWith(" jr")){
            System.out.println("Nice to meet you Junior");
        }




    }
}
