package day55_polymorphism.shopping;

public class Runner {
    public static void main(String[] args) {
        Target target = new Target();
        target.price =10;
        target.buyItem();
        target.returnItem();

        Amazon amazon = new Amazon();
        amazon.price = 100;
        System.out.println(amazon.price);
        amazon.buyItem();
        amazon.returnItem();
        amazon.payForShipping(true);
        amazon.viewChart();
        System.out.println(amazon.country);

        System.out.println();

    }


}
