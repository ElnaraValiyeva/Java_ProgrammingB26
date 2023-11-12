package Day44_Custom_day;

public class Food {
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Food(String name){
        this.name=name;
    }
    public Food(String name, int quantity){
        this(name);
        this.quantity=quantity;
    }
    public Food(String name,int quantity, double unitPrice){
        this(name,quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }
    public void calculatePrice(){
        this.totalPrice = quantity *unitPrice;
    }
    @Override
    public String toString(){

        return "Food: " + "\nName: "  + name + "\nQuantity: " + quantity + "\nUnit Price: " + unitPrice + "\nTotal Price: " + totalPrice;

    }








}
