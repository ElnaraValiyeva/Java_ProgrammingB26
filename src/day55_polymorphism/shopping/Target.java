package day55_polymorphism.shopping;

public final  class Target  extends Shopping{

    @Override
    public void buyItem() {
        System.out.println("Buying from Target");

    }

    @Override
    public void returnItem() {
        System.out.println("Returning Item to Target");

    }
}
