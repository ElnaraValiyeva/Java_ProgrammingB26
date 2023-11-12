package Days06_aritmetic_operators;

public class CastingExamples {
    public static void main(String[] args) {

         short numOne = 40;
         float numTwo = numOne; //short is smaller than float, so no casting is needed from us

        System.out.println(numOne);
        System.out.println(numTwo);

        float num3 = 100.5F;
        short num4 = (short)num3;
        System.out.println(num4);

        float num5 = 300;
        byte num6 = (byte )num5;

        System.out.println(num5);
        System.out.println(num6);

        char letter = 'A';
        int letter2 = letter;

        System.out.println(letter);
        System.out.println(letter2);
        System.out.println((int)letter);
        System.out.println((char)66);
        System.out.println((int)'#');

        Short number2 = 20;
        float number3 = (float) number2;
        System.out.println(number3);

        double d = 4.2;
        int i = (int)d;
        System.out.println(i);

        char letter1 = 'a';
        int letter4 = letter1;










    }
}
