package day46_static;

public class IPone {

    String model;
    double price;

    static String company;
    static String  os;
    static boolean appleDay;
    static String day;

    static{
        System.out.println("Static Block run");
        company ="Apple";
        os = "IOS";
        day = "Wednesday";

        if(day.equals("Friday")){
            appleDay = true;
        }
    }

    public IPone(String model, double price){
        this.model=model;
        this.price=price;

    }
    @Override
    public String toString(){
        return "Ipone{" +
                "model='" + model + '\'' + ", price=" + price +'}';

    }
}


