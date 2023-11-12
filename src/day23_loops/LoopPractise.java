package day23_loops;

public class LoopPractise {
    public static void main(String[] args) {
         String str = "aaaakkkkkfff";
         int count = 0;

         for(int index = 0; index < str.length();index++){
             if(str.charAt(index) == 'k' && str.charAt(index + 1) =='f'){
                 count++;
             }
             System.out.println(count);
         }
    }
}
