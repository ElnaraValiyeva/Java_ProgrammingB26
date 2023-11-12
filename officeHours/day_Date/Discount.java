package day_Date;

public class Discount {
    public static void main(String[] args) {

        int quantity = 5;
        int unitPrice =100;
        double totalCost=quantity*unitPrice;
        double discountRate=0.1;
        double totalDiscount=0;

        if(totalCost>1000){
            totalDiscount=totalCost*totalDiscount;
        }
    }
}
