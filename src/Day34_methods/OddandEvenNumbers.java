package Day34_methods;

public class OddandEvenNumbers {

    public static void main(String[] args) {
        int num1 = 100;
        oddOrEven(5);

        int num2 = 6;
        oddOrEven(num2);

        int age = 50;
        eligible(age);

        initial("Cydeo","School");

        maxNum(10.08,20.30);


    }

    public static void oddOrEven(int number){

        if(number % 2 == 0){
            System.out.println("Is even number" + number);
        }else{
            System.out.println("Is odd number" + number);
        }

    }

    public static void eligible(int age){

       if(age>=18){
           System.out.println("You are eligible to buy alcohol");
       }else{
           System.out.println("You not eligible");
       }


    }

    public static void initial(String firstName, String lastName){
        firstName ="School";
        lastName="Cydeo";

        System.out.println(firstName.charAt(0) +"."+ lastName.charAt(0));



    }

    public static void maxNum(double num1, double num2){
        if(num1 > num2){
            System.out.println(num1 + " is the ");
        }else if(num2 > num1){
            System.out.println(num2 + " is the maximum number");
        }else{
            System.out.println("Equal");
        }

 }
 }
