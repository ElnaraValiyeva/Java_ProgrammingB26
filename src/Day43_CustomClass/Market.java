package Day43_CustomClass;

public class Market {

    String type;
    String brand;
    String color;

    public Market(String inputType, String inputBrand,String inputColor){
        type = inputType;
        color = inputColor;
        brand = inputBrand;
    }

    @Override
    public String toString(){

        return "Marker{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
