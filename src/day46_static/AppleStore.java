package day46_static;

public class AppleStore {
    public static void main(String[] args) {

        IPone phone = new IPone("iphone X",1000);
        System.out.println(phone);

        IPone phone2 = new IPone("Iphonee 11", 1200);
        System.out.println(phone2);


        System.out.println(IPone.company);
        System.out.println(IPone.os);

    }
}
