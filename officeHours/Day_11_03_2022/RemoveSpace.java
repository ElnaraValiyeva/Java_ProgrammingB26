package Day_11_03_2022;

import java.util.Arrays;

public class RemoveSpace {
/*
       Task 3 :    Write a method that can remove  all extra space from String

    Input: "  Hello world      I      love      Java    "
    Output: Hello world I love Java
 */

    public static void RemoveSpace(String str){


      String []  s = str.trim().split(" ");
        System.out.println(Arrays.toString(s));


         String result = "";
         for(String each : s){

             if(!each.isEmpty())
             result+=each+ " ";
         }
        System.out.println(result);

    }

    public static void main(String[] args) {
        String str = " Hello world    I   love   Java";
        RemoveSpace(str);



    }

}
