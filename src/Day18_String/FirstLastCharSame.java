package Day18_String;

import javax.xml.transform.Source;
import java.util.Scanner;

public class FirstLastCharSame {

    public static void main(String[] args) {
        /*
           Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word");
        String word1 = input.next();

        System.out.println("Enter the second word");
        String word2 = input.next();

        System.out.println("Enter the third word");
        String word3 = input.next();

        input.close();

        String result = "";


        if(word1.length() == word2.length() && word2.length() == word3.length()){
            result = "All words are same length";
        }else if(word1.length() == word2.length()){
            result = "Not Same nor Different lengths";

        }else if(word2.length() == word3.length()){
            result= "Not Same nor Different lengths";
        }else{
            result="All different length";
        }
        System.out.println(result);
    }
}
