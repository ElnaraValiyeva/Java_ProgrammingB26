package day47_encapsulation;

public class DebitCard {
    //instance variables
    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    //static variables
    static String accountType;

    static{
        accountType ="Cheking";

    }
    public DebitCard(long cardNumber, String holderName, double balance){
        this.holderName = holderName;
        this.balance = balance;

        if(String.valueOf(cardNumber).length() == 16){ // ("" + cardNumber).length()
            this.cardNumber = cardNumber;
        } else {
            System.err.println("Invalid card number"); // err makes the output red
        }
    }

    // this() is used to chain the constructors





    public DebitCard(long cardNumber,String holderName, String cardType, int pin, double balance){
        this(cardNumber,holderName,balance);

        if(cardType.equalsIgnoreCase("visa") || cardType.equalsIgnoreCase("mastercard")){
            this.cardType= cardType;
        }else{
            System.out.println("Invalid Card type - Must be Visa or Mastercard");
        }

        if(String.valueOf(pin).length()==4){
            this.pin = pin;
        }else{
            System.out.println("Invalid Pin - Must be 4 digit");
        }
    }

    public String toString(){

        String info = "Holder Name: " + holderName;

        if(cardNumber !=0){
            info+="\nCard Number: " + cardNumber;
        }
        if(cardType != null){
            info +="\n Card Type: " + cardType;
        }

        info +="\n Balance: " + balance;
        return info;
    }

}
