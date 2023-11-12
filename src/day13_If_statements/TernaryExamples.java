package day13_If_statements;

public class TernaryExamples {

    public static void main(String[] args) {

        int a = 4;
        String evenOdd;

        if(a % 2 == 0){
            evenOdd= "Even";
        }else{
            evenOdd = "odd";

        }

        String result = a % 2 == 0 ? "Even" : "Odd";
        System.out.println(result);
    }
}
