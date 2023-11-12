package day63_functional_interface;

public class UsingDynamicInterface {
    public static void main(String[] args) {

         Dynamiczinterface <String> printEachChar = (str) ->{
             for(int i = 0; i < str.length();i++){
                 System.out.println(str.charAt(i));
             }

         };
         printEachChar.test("hello world");

         Dynamiczinterface<Integer> omg = n->{
             System.out.println(n);
             System.out.println(n);
             System.out.println(n);
             System.out.println(n);
         };
        System.out.println(10);

    }
}
