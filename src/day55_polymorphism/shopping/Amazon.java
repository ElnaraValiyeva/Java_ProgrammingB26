package day55_polymorphism.shopping;

public final class Amazon extends OnlineSopping {
    public int price;

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");

    }

    @Override
    public void returnItem() {
        System.out.println("Return item to Amazon");

    }

    @Override
    public void viewChart() {
        System.out.println("Viewing Amazon chart");

    }

    @Override
    public void payForShipping(boolean b) {
        System.out.println(b ? "Pay for shipping": "Free Shipping");

    }
}
