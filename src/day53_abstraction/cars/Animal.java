package day53_abstraction.cars;

public abstract class Animal {

    public String name;
    public String breed;
    public int age;
    public String size;

    public Animal(String name, String breed, int age, String size) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                '}';
    }

    public abstract void eat();
}
