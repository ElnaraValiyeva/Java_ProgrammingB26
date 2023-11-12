package week_10.statics;

public class OuterClass {

    public static class InnerClass{ //static method
         static  int staticInnerClassVar=3; // static variable
        int InstanceVar = 10;
    }

    public static void main(String[] args) {
        System.out.println(InnerClass.staticInnerClassVar);
    }
}
