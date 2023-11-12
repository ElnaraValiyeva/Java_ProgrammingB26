import java.sql.SQLOutput;
import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {

        char lowercaseUp = 'a';

        while(lowercaseUp<= 'z'){
            System.out.print(lowercaseUp + ",");
            lowercaseUp++;

        }

        char uppercaseBack = 'Z';
         while(uppercaseBack >= 'A'){
             System.out.print(uppercaseBack + " ,");
             uppercaseBack--;
         }

         int  a3 = 0;

         do{
             System.out.println((a3));
             a3+=2;
         }while(a3<=10);





    }




    /*

    System.out.println("Please Enter 10 numbers");
			input = new Scanner(System.in);
			int sum = 0;
			for (int i = 0; i < 10; i += 1){
				sum += input.nextInt();
			}
			System.out.println("The total sum is: " + sum );
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			input.close();
		}


     */
}
