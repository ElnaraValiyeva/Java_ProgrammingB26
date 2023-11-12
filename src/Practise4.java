public class Practise4 {
    public static void main(String[] args) {

        int e =1;

        while (e <= 50){
            if(e%3 == 0 && e % 5 ==0){
                System.out.println("FizzBuzz");
            }else if(e %3 == 0){
                System.out.println("Fizz");
            }else if(e % 5 == 0){
                System.out.println("Buzz");
            }
            e++;


        }

        int i =10;
         while(i <=10){
             System.out.println("I like java");
             ++i;
             System.out.println("good to hear that");
             i--;
         }












        /*

        int num = 20;
        String result;
        if (num % 3 == 0) {
            result = "Fizz";
        } else if (num % 5 == 0) {
            result = "Buzz";
        } else {
            result = " Not print";

         */



    }
}
