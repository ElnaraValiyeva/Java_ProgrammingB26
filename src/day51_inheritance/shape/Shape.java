package day51_inheritance.shape;

public abstract class Shape {

    String name;

    public Shape(String name){
        this.name = name;
    }
    public double area(){
        return 0.5;
    }
    public double perimeter(){
        return 0.0;
    }

    public abstract double areas();
}
