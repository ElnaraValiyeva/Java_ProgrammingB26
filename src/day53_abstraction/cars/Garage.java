package day53_abstraction.cars;

public class Garage {
    public static void main(String[] args) {
        Toyota obj2 = new Toyota();
        obj2.start();

        System.out.println();


        Honda obj3 = new Honda();
        obj3.start();

        Tesla obj5 = new Tesla();
        obj5.start();
        obj5.charge();// Tesla was non-abstract classs, so it was concrete, which mean it had to ovveride all the abstract methods from the super classes




    }
}
