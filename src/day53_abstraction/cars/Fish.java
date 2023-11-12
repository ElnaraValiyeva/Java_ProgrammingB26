package day53_abstraction.cars;

public class Fish extends Animal{

    public Fish(String name, String breed, int age, String size) {
        super(name, breed, age, size);
    }

    @Override
    public void eat() {
        System.out.println("Fish eat the seems");
    }
}
