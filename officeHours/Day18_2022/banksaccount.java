package Day18_2022;

public class banksaccount {

    String accountHolder;
    String accountNumber;
    double availableBalance;

    public banksaccount(String accountHolder, String accountNumber){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
    }
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Ddepositing amount can not be zero or negative");
        }else {
            availableBalance+=amount;
        }


    }

}
