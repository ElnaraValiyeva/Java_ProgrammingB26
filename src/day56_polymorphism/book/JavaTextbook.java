package day56_polymorphism.book;

public class JavaTextbook  extends Ebook{

    boolean fun;

    @Override
    public void read() {

    }

    @Override
    public void download() {
        System.out.println("Downloading java textbook");

    }

    @Override
    public void open() {
        System.out.println("Opening java text book");

    }
}

