package day53_abstraction.cars;

public class Tesla extends ElectricCar{
    @Override
    public void start(){
        System.out.println("card in the car");
        System.out.println("press button");


    }

    public void charge(){
        System.out.println("charging tesla");

    }
}
