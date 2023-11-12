package ShortVideosTask;

public class Student {

    public String name;

    public int age;

    public String gradeLevel;

    public Student (String name, int age, String gradeLevel){
        this.name = name;
        this.age = age;
        this.gradeLevel =gradeLevel;

    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }
}
