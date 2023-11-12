package Task;

public class UseSquare {
    public static void main(String[] args) {

        Square obj= new Square(3.5);
        System.out.println(obj);

        System.out.println(obj.calculatePerimeter(34.3));
        System.out.println();
        System.out.println(obj.getSide());
        System.out.println(obj);

        obj.getSide();
        System.out.println(obj.getSide());

        System.out.println();
        Square obj2 = new Square(2.7);
        System.out.println(obj2.calculatePerimeter(23.5));
        System.out.println(obj2);
    }
}
