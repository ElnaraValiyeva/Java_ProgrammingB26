package Day_29_Array;

import java.util.Scanner;

public class GradeArray {
    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        System.out.println("Please, enter students: ");
        int student = input.nextInt();
        String [] names = new String [4];
        int [] scores = new int [student];
        char [] grades = new char[student];

        for( int i = 0; i< names.length;i++){
            System.out.println("Enter the students name:" + (i+1));
            names[i] = input.next().trim();
        }
        for (int i =0; i < names.length;i++){
            System.out.println("Enter you score for name number " + (i+ 1));
            scores[i]= input.nextInt();
        }
        for(int i = 0; i< names.length;i++){
            if(scores[i] > 85){
                grades [i] = 'A';
            }else if(grades[i] <=85&& grades[i] > 75){
                grades[i] = 'B';
            }else if(grades[i] <= 75 && grades[i] > 65  ){
                grades[i] = 'C';
            }else{
                grades[i] ='D';
            }
            System.out.println(names[i] + "|" + scores[i] + "|" + grades[i]);
        }






    }
}
