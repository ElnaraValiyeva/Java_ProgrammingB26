package InterviewQuestion;

import day24_loopPractice.reverse;

public class reverseString {
    public static void main(String[] args) {

      String str= "apple";

        System.out.println(reverseStr("apple"));
    }
    // reverseStr("phone");
    // reverseStr ("123456);

    public static String reverseStr(String str){
        StringBuilder reverse = new StringBuilder ();

        for(int i = str.length()-1; i>=0; i--){

            // add chars to reverse a variable

            reverse.append(String.valueOf(str.charAt(i)));

        }
        return reverse.toString();


    }




}
