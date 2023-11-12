package Day42_Custom_clasess;

public class AllPeople {
    public static void main(String[] args) {
/*
        System.out.println(name);
        System.out.println(age);
        System.out.println(Person.name);
        System.out.println(Person.age);
        /*
 */

        Person personOne = new Person();

        Person personTwo = new Person();
        personOne.name ="James";
        personOne.age = 40;
        personOne.height = 5.10;
        personOne.isMarried= false;

        System.out.println(personOne.name);
        System.out.println(personOne.age);
        System.out.println(personOne.height);
        System.out.println(personOne.isMarried);

        //printing the instance variables


    }
}
