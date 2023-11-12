public class Day21_loopOperation {
    public static void main(String[] args) {

        int num =1 ;

        while(num <=100){
            if(num % 2==1){

                System.out.println( num + " " );
            }
            num++;
            //odd number
            //even number

            int sum = 1;
            while(sum++ < 100){
                if(sum % 2 == 1){
                    System.out.print(sum + " ,");
                }
            }
        }
    }
}
