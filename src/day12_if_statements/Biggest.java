package day12_if_statements;

public class Biggest {
    public static void main(String[] args) {
        int num1 = 100;
        int num2=150;
        int num3 = 240;

        if(num1>num2 && num1>num3){
            System.out.println("The biggest number" +num1);
        }else if(num2>num1&&num1>num3){
            System.out.println(num2 + " is th biggest");
        }else{
            System.out.println(num3 + " is the biggest");
        }







    }
}
