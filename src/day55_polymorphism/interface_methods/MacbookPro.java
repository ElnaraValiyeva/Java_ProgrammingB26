package day55_polymorphism.interface_methods;

import java.sql.SQLOutput;

public class MacbookPro implements Mac {

    @Override
    public void turnOn() {
        System.out.println("mac is running");

    }
}

class Runner{
    public static void main(String[] args) {
        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);


        MacbookPro obj = new MacbookPro();
        obj.turnOn();
        obj.faceTime();
    }
}
