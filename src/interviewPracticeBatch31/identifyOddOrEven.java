package interviewPracticeBatch31;

public class identifyOddOrEven {
    /*
     * Write me a method which can identifies given number is even or odd
     * identify(5) -> print "Odd"
     * identify(6) -> print "Even"
     */
    public static void identify(int number) {

        if (number == 0)
            return;

        if (number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }

    public static void main(String[] args) {
        identify(6);
    }
}
