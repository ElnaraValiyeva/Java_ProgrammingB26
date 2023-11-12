package Day28_Arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {


 //       String[] months = {"January", "February", "March", "April", "May", "June",
 //               "July", "August", "September", "October", "November", "December"};
 //       Scanner sc = new Scanner(System.in);
  //      System.out.print("Please, enter month name : ");
  //      String month = sc.next();

  //      for (int i = 0; i < months.length; i++) {
   //         if (month.toLowerCase().equals(months[i].toLowerCase())) {
    //            System.out.println("Your Month number is " + (i + 1));
  //              break;
 //           }

  //      }


        
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter month name: ");
        String [] monthName =  {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int num=0;
        for(int i =0; i< 12;i++){
            if(num==i){
                System.out.println(monthName[i]);

            }

        }
        
    }
}
