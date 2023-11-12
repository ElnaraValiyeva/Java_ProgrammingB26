package week_10.statics;

public class reachVarFromAnotherClass {

    public static void main(String[] args) {
        System.out.println(OuterClass.InnerClass.staticInnerClassVar);
       // System.out.println(new OuterClass.InnerClass().var);
    }
}
