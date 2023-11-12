package Day42_Custom_clasess;

public class Coffee {
    String brand;
    String type;
    double sizeOz;
    double price;

    public String toString(){
        return "Coffee from " + brand + " size of " + sizeOz + " oz.For a totalprice of " + price;

    }
    public void drink(){
        System.out.println("Drinking " + type);
        sizeOz -=1.5;
    }

    public void refill(double amount){
        System.out.println("Refilling " + amount + " oz of coffee");
        sizeOz += amount;
    }

}

