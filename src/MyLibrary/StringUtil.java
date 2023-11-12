package MyLibrary;

import java.util.Locale;

public class StringUtil {
    public void String (String str){





    }







    /*

    Camel Case

create a method that will accept a String, of words separated by spaces, and return a camel case
version of the String where the first letter of each word is Uppercase and the rest of the word is in lowercase.
Exception: First word starts with lowercase..

     */


    public static String reverse(String str){
        String reversed = "";
        for(int i = str.length()-1; i>=0; i--){
            reversed+= str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse("java"));

    }
    public static int frequencyOfCharacter(String str, char letter){

        int count = 0;
        for(int i =0; i< str.length(); i++){
            if(str.charAt(i)==letter){
                count++;
            }
        }
        return  count;
    }






}
