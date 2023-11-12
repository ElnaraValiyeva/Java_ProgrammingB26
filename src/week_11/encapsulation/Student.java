package week_11.encapsulation;

public class Student {

    public int age;
    public String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
