package day50_inheritance.computer;

import javax.crypto.Mac;

public class Lab {
    public static void main(String[] args) {
        Computer obj1 = new Computer("generic os", 300);
        System.out.println(obj1);

        Windows obj2 = new Windows(100);
        System.out.println(obj2);

        mac obj3 = new mac("Mac", 300);
        System.out.println(obj3);
    }
}
