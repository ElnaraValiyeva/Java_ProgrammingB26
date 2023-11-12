package Task;

import java.sql.SQLOutput;

public class Practise {

    public static void main(String[] args) {
      int total =   sum (20, 49)* 3;
        System.out.println(total);

        System.out.println("----------");

        String s1 =reverse("Wooden Spoon");
        System.out.println(s1);

        System.out.println(isPalindrome("civic"));
    }
    public static int sum(int num1, int num2){

         int result = num1+num2;
        return result;
    }

    public static  String  reverse(String str){

        String result = "";

        for(int i = str.length()-1; i>= 0; i--){
            result +=str.charAt(i);
        }

        return result;
    }

    public static boolean isPalindrome(String str){

        String reversed = reverse(str);
        return reversed.equalsIgnoreCase(str);
    }






}
