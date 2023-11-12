package InterviewQuestion;

public class PrintWithoutLoop {
    public static void main(String[] args) {

        int n = 1;
        printNum(n);

    }

    public static void printNum(int num){
        // num less than or equal to 100
        if(num <= 100){
            System.out.println(num + " ");
            printNum(num+1);
        }
    }
}
