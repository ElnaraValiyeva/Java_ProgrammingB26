package day01_02_15_2022;

public class day02_CastingPractice {
    public static void main(String[] args) {

        byte b=10;
        short s = b;//Implicit Casting

        // double to int
        double a =5.3;
        int i =(int) a;
        System.out.println("i =" + i);
        a=i;
        System.out.println("a = " + a);

        //long to int
        //long l = 99
        long l=999999999l;

        short r = 1000;
        byte j=2;
        int k=4;

        long d= i + j + k;
        System.out.println(d);
    }

}
