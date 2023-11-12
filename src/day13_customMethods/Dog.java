package day13_customMethods;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;

    public void eat(){
        System.out.println(name +" is eating dog food");
    }

    public void sleep(){
        System.out.println(name + " is sleeping for dog");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
