package day12_if_statements;

public class ClassCalculator {
    public static void main(String[] args) {
        int num1=20;
        int num2 =15;
         char operatorletter = '/';

         if(operatorletter == '+'){
             System.out.println(num1 +num2);
         }else if(operatorletter=='-'){
             System.out.println(num1-num2);
         }else if(operatorletter == '/'){
             System.out.println(num1/num2);
         }else{
            System.out.println("Invalid operator");
        }
    }
}
