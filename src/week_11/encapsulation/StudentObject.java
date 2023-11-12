package week_11.encapsulation;

import week_11.encapsulation.Student;

public class StudentObject {

    public static void main(String[] args) {

        Student student = new Student(12,"Adam");
        System.out.println(student);

        Student student1 = new Student(30,"Ella");
        student1.age=30;
        student1.name="Adam";
        System.out.println(student1);

        








}}
