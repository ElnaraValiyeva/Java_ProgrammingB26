package day51_inheritance.shape;

public class Square extends Shape{

    double side;

    public Square(double side){
        super("Square");
        this.side = side;
    }

    @Override

    public double areas(){
        return side * side;
    }

    @Override
    public double perimeter(){
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                " name=" + name +
                '}';
    }
}
