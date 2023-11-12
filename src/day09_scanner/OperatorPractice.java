package day09_scanner;

public class OperatorPractice {
    public static void main(String[] args) {
        int w = 78/2 * 2 + 3 - 5 % 5;
        /*
        sout

         */
        System.out.println(w);

        int a =8;// 8 ->7
        int b = a--; //b=8
        System.out.println(b);
        System.out.println(a);

        int L = 50;//L = 50 -> 49->50->49 ->50
        int P = --L + L++ + L++;
        System.out.println(P);

        int R = 20; // R= 20 ->
        int W = -R-- + -R++ + --R * R-- %2;//- 20 + -19 + 19 18 % 2


    }
}
