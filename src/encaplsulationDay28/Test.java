package encaplsulationDay28;

public class Test {
    public static void main(String[] args) {

        Circle circle = new Circle(0.5);

        // Print the initial radius using the getting method
        System.out.println("Initial Radius: " + circle.getRadius());

        //Change the radius using the setter method
        circle.setRadius(4.5);

        //Print the update radius using the getting method
        System.out.println("Updated Radius: " + circle.getRadius());


    }
}
