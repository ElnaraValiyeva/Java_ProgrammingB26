package Day49_inheritance;

public class Building {
    public static void main(String[] args) {

        Person obj = new Person();
        obj.name = "Elnara";
        obj.age = 40;
        obj.favouriteHobby="Book reading";
        obj.talk();

        Student obj2 = new Student();
        obj2.name = "Jorge";
        obj2.age = 10;
        obj2.favouriteHobby = "drawing";

        obj2.funlevel = 100;
        obj2.study();

    }
}
