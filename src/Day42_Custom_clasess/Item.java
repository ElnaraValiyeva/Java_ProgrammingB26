package Day42_Custom_clasess;

public class Item {
    String name;
    double price;

    @Override
    public String toString(){
        return "name: '" + name + '\'' +",price: " + price;
    }
}
