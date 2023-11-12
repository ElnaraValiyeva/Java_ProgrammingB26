package Day_29_Array;

import java.util.Scanner;

public class LongestPolidrome {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of words");
        int num = input.nextInt();
        String [] word = new String[num];
        String reverse = "";
        String biggestPolindrome ="";
        boolean hasPolindrome = false;

        for(int i =0; i < num;i++){
            System.out.println("Please, enter word number: " + (i+1));
            word[i]= input.nextLine();
        }
        for(int i=0; i <num;i++){
            reverse ="";

            for(int j= word[i].length()-1; j>=0;j--){
                reverse +=word[i].charAt(j);

                if(reverse.equalsIgnoreCase(word[i])){
                    biggestPolindrome=reverse;
                    hasPolindrome=true;
                    if(reverse.length()> biggestPolindrome.length()){
                        biggestPolindrome=reverse;
                    }
                }
            }
        }
        if(hasPolindrome){
            System.out.println("The longest polindrome is: " + biggestPolindrome);
        }else{
            System.out.println("No palindrome!");
        }



    }
}
