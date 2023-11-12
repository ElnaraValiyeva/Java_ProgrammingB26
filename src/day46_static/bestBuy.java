package day46_static;

public class bestBuy {

    String location;

    static String headquarters = "Richfield, Minnesota, United States";

    static String day = "Wednesday";

    static int numberOfComputer = 100;

    public bestBuy(String location){
        this.location= location;

    }
    public static  void reStock(){
        numberOfComputer+= 20;
    }
}
