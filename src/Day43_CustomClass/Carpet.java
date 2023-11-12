package Day43_CustomClass;

public class Carpet {
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet(boolean inputPersian, double inputWidth, double inputLenght,double inputUnitPrice ){
         width=inputWidth;
         length=inputLenght;
         isPersian=inputPersian;
         unitPrice = inputUnitPrice;
         calculatePrice();

    }
    public void calculatePrice(){
        totalPrice= width*length*unitPrice;

        if(isPersian){
            totalPrice+= 200;
        }
    }

        public String toString(){
            return (isPersian ? "The Persian Carpet " : "The Carpet ") +
                    "\nhas dimensions of " + length + " x " + width +
                    "\nThe unit price is " + unitPrice +
                    "\nAll coming to a total of: " + totalPrice;
        }



}
