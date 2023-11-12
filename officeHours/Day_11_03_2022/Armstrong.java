package Day_11_03_2022;

public class Armstrong {
    public static void main(String[] args) {
        isArmstrong(153);



    }



    //153 ==(1*1*)+(5*5*5)+(3*3*3)

    //1 125 27 == 153

    //153

    //3 ----153 % 10--- 153/10 ---15
    //5 -----15 % 10 ----- 15/ 10 --- 1
    //1 -----1 % 10 -------1/10 ---> 0;

    public static void isArmstrong(int number){

        int lastDigit = 0;
        int  totalDigits = 0;
        int originalNumber= number;

        while(number >0){
            lastDigit=number%10;//find the last digit

            System.out.println("lastDigit: " + lastDigit );

            number/=10;
            totalDigits+=lastDigit*lastDigit*lastDigit;
        }
        System.out.println(totalDigits);

        if(totalDigits==originalNumber){
            System.out.println(originalNumber);
        }

    }


}
