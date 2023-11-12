package Day3_Arrays;

import day24_loopPractice.reverse;

import java.util.Arrays;

public class ReverseDay {
    public static void main(String[] args) {
   //     String word = ("Today is Monday");
   //     String [] word2 =word.split(" ");
  //      String reverse = "";

  //      for( int i =word2.length-1; i>=0;i--){
  //          reverse+=word2[i] + " ";
  //      }
  //      System.out.println(reverse);

  //      System.out.println("============");

        String str = ("Java is fun");
        String [] str2 = str.split(" ");
        String reversed = "";
        char [] middleWord = str2[1].toCharArray();

        for(int i = middleWord.length -1; i>=0;i--){
            reversed+=middleWord[i];


        }
        System.out.print(str.replace("is", reversed));

    }
}
