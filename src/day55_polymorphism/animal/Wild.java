package day55_polymorphism.animal;

public class Wild {

    public static void main(String[] args) {
        Lizard lizard = new Lizard();
        lizard.eat();
       lizard.name="ELLI";
        System.out.println(lizard.name);


        Reptile reptile = new Lizard();
        reptile.eat();

        ANimal animal = new Lizard();
        animal.eat();


    }

}
