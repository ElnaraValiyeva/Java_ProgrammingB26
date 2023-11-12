package Day3_Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String [] words = {"java", "longer word", "civic", "apple", "racecar", "racecar","mom","anna"};

            String longestPalindrome = "";

            for(String eachword : words){ //eachword == words[i]

                boolean isPalindrome = true;

                for(int i = 0; i < eachword.length()/2;i++){

                    if(eachword.charAt(i) != eachword.charAt(eachword.length() - 1 - i)){
                        isPalindrome=false;
                        break;
                    }
            }
                if(isPalindrome && eachword.length() > longestPalindrome.length()){
                    longestPalindrome = eachword;
                }
        }
        System.out.println(longestPalindrome.isEmpty()? "No Palindrome" : longestPalindrome);
    }


}
