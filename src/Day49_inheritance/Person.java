package Day49_inheritance;

public class Person {
    /*

    Person is the Super class
    name, age favourite hobby
    talk()

    Student class it the sub class of Person
     int stresslevel
    study()
     */

    String name;
    int age ;
     String favouriteHobby;

     public void talk(){
         System.out.println(name + " is talking ");
     }
}
