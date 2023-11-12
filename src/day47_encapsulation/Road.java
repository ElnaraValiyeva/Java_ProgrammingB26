package day47_encapsulation;

public class Road {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("grey");

        TrafficLight ligth2 = new TrafficLight("red");
        System.out.println(ligth2.getColor());

     ligth2.setColor("grey");
        System.out.println(ligth2.getColor());

        TrafficLight light3 = new TrafficLight("Black");
        System.out.println(light3.getColor());



    }
}
