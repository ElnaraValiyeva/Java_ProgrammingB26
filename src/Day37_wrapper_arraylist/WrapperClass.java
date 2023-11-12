package Day37_wrapper_arraylist;

public class WrapperClass {
    public static void main(String[] args) {

        int a =5;

        Integer a2 = new Integer(10);
        Integer a3 = 20;

        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);

        byte b = 2;
        Byte b2 = 20;

        Integer str1 = new Integer(20);
        Integer str2 = new Integer(10);
        int num= str2.intValue();
        System.out.println(num + " " + str1);



    }
}
