package day_Date;

public class codilityTest {
    public static void main(String[] args) {

        int number =15;
        String result="";

        if(number%2 == 0 && number % 3==0 && number % 5==0){
            result="Codility";
        }else if(number%2==0&& number%3==0){
            result="Test";
        }else if(number%5==0){
            result="Coders";
        }else if(number%2==0 && number%5==0){
            result="CodilityTest";
        }else if(number%3==0 && number%5==0){
            result="TestCoders";
        }else if(number%2==0 && number%3==0 && number%5==0){
            result="CodilityTestCoders";
        }
        System.out.println("result = " + result);




    }
}
