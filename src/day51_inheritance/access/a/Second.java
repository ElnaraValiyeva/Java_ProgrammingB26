package day51_inheritance.access.a;

public class Second {

    //different class, same package
    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
       // System.out.println(obj.four);

       // four is not accessable because private class

    }

}
