package Task;
import java.util.Scanner;
public class SumofNumbers {

    public static void SumofNumbers(int [] numbers){

        int sum =0;
        for(int i =0; i< numbers.length; i++){
            sum+=numbers[i];
        }
        System.out.println("The sum of each numbers is: " + sum + ".");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please , enter amount  the numbers.");
        int [] arr = new int [input.nextInt()];
        for( int i = 0; i< arr.length;i++){
            System.out.println(" Please enter number "+ (i + 1) + "of your array" );
            arr [i] = input.nextInt();
        }
       SumofNumbers(arr);

        for (int j = 1; j<=10; j++){
            if (j ==5){
                break;
            }
            System.out.println(j);
        }


    }
}
