package day55_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {
        TShirt tShirt1 = new TShirt();
        tShirt1.wear();

        Clothes tShirt2 = new TShirt();
        tShirt2.wear();

        Jacket jacket1= new Jacket(); // reference os itself
        jacket1.wear();
        jacket1.putOnHood();

        Clothes jacket2 = new Jacket(); //reference of super class
        jacket2.wear();


        HashHood jacket4 = new Jacket();
        jacket4.putOnHood();

    }

    public static void buy(Clothes clothes){
        if(clothes instanceof TShirt ){
            System.out.println("Bought Tshirt");
        }
    }
}
