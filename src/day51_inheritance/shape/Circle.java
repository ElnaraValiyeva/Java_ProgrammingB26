package day51_inheritance.shape;

public class Circle extends Shape{

    double radius;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double areas() {
        return super.area();
    }

    @Override
    public double area() {
        return super.area();
    }

    public double perimeter () {
       return  super.perimeter();
    }


}
