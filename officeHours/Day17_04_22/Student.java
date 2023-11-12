package Day17_04_22;

import Day_13_03_22.Overloading;

import java.lang.reflect.Constructor;

public class Student {
    /*
    Task 1 ======= (Parameterized vs No Arg  java.lang.reflect.Constructor |  Chaining | Overloading | This() )
    className --- > Student
    instance variables:
    name, age, batchNumber

                    	1st constructor: initializes the name ONLY

                    	2nd constructor: initializes name & age
            (MUST apply constructor Call)

                    	3rd Constructor: initializes name, age ,batchNumber
           							(MUST apply constructor Call)

    instance methods: toString()
    */
    String name;
    int age;
    int batchNumber;

    public Student(String name){
        this.name=name;
    }
    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Student(String name, int age,int batchNumber){
        this.name=name;
        this.age=age;
        this.batchNumber=batchNumber;

    }
}
