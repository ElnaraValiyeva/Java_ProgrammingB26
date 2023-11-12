package day52_inheritance.final_example;

public class B  extends A{

    @Override

    public void instanceMethodA(){
        staticMethod();

    }

    public static void staticMethod(){
        System.out.println("Static method from child class");
    }

}
