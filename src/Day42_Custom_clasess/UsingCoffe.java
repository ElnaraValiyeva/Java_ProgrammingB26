package Day42_Custom_clasess;

public class UsingCoffe {
    public static void main(String[] args) {

        Coffee coffee1= new Coffee();
        coffee1.brand = "Starbucks";
        coffee1.price=5.99;
        coffee1.sizeOz=12;
        coffee1.type="black";

        System.out.println(coffee1);
        coffee1.drink();
        coffee1.refill(8);

        System.out.println(coffee1);


    }
}
