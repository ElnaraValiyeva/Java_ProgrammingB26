package day46_static;

public class bestBuyStores {
    public static void main(String[] args) {
        System.out.println(bestBuy.headquarters);
        System.out.println(bestBuy.day);
        System.out.println(bestBuy.numberOfComputer);

        bestBuy store1 = new bestBuy("Oak Driver");
        System.out.println(store1.location);


       bestBuy store2 = new bestBuy("Main St");
        System.out.println(store2.location);

        System.out.println(bestBuy.numberOfComputer);

        store2.location ="Fairfax";
        System.out.println(store1.location);
        System.out.println(store2.location);

        bestBuy.reStock();
        System.out.println(bestBuy.numberOfComputer);


    }
}
