package day23_loops;

public class SubLoop {
    public static void main(String[] args) {
         String s ="aaabbbccccccddddeeeeeeee";
         String substring = "";
         String maxSubstring = "";
         int start = 0;

         for(int i=0; i<s.length()-1; i++){


             String j = "" + s.charAt(i);
             String k = "" + s.charAt(i +1);


             if(j.equals(k)){
                 substring=s.substring(start, 1 +2);

             }else{
                 start=1+1;
             }
             if (maxSubstring.length() < substring.length()){
                 maxSubstring=substring;
             }
         }
        System.out.println("substring= " + maxSubstring);








    }
}

