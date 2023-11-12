package day53_abstraction.cars;

public class Cat extends Animal {

    public Cat(String name, String breed, int age, String size) {
        super(name, breed, age, size);
    }

    @Override
    public void eat() {
        System.out.println("Cat eat the fish");
    }
}
