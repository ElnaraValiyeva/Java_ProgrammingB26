package Task;

import java.util.Locale;

public class Palindrome {

    public static void polindrome(String str){
       String reversed = "";
        str = str.toLowerCase();//trim().replace(""," ");

        for(int i = str.length()-1;i>=0;i--){
            reversed += str.charAt(i);
        }
        if(str.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Word is not palindrome");
        }
        System.out.println();



           /*
           public static void palindromeMethod(String input){
       input=input.toLowerCase().trim().replace(" ","");
        String reversed="";
        for (int i= input.length()-1;  i>=0 ; i--) {
            reversed+=input.charAt(i);
        }
        if(input.equals(reversed)){
            System.out.println("Word is palindrome");
        }else {
            System.out.println("Word is not palindrome");
            public static void main(String[] args) {
        palindromeMethod("Nurses run");
    }


            */


    }

    public static void main(String[] args) {
        polindrome("civic");
    }


}
