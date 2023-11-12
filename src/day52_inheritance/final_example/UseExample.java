package day52_inheritance.final_example;

public class UseExample {
    public static void main(String[] args) {

        System.out.println(FinalExample.Planet);

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);

        System.out.println();

        FinalExample obj2 = new FinalExample(100);
        System.out.println(obj2.b);
        System.out.println(obj2.a);
    }
}
