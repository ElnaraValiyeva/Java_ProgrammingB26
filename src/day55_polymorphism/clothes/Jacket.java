package day55_polymorphism.clothes;

public class Jacket extends Clothes implements HashHood{

    @Override
    public void wear() {
        System.out.println("Wearing a clothes");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting the jacket hood on");

    }
}
