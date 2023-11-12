package Day18_String;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first word");
        String str1 = input.next();
        System.out.println("Enter second word");
        String str2 = input.next();
        System.out.println("Enter third word");
        String str3 =input.next();

        if(str1.length()>str2.length()&&str1.length()>str1.length() && str3.contains("a")){
            System.out.println("The longest word: " + str1);
        }if(str2.length()>str1.length()&& str2.length()>str3.length()&& str2.contains("a")){
            System.out.println("The longest word: " + str2);
        }if(str3.length()>str2.length()&& str3.length()>str2.length()&& str3.contains("a")){
            System.out.println("The longest word: " + str3);
        }else{
            System.out.println("Invalid word");
        }
    }
}
