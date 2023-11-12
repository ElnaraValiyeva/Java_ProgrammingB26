package Day43_CustomClass;

import java.rmi.MarshalException;

public class UseMarket {
    public static void main(String[] args) {
        Market market1 = new Market("Dry Erase", "Expo","Red");
        System.out.println(market1);
    }
}
