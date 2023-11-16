package interviewPracticeBatch31;

public class OddOrEvenNumber {

    public static void main(String[] args) {

        int num1 = 6;
        OddOrEven(6);

        int num2 = 7;
        OddOrEven(7);

    }

    public static void OddOrEven(int number){

        if(number % 2 == 0){
            System.out.println("Is even number " + number);
        }else{
            System.out.println("Is odd number " + number);
        }
    }

}
