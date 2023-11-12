package day56_polymorphism.book;

public  abstract  class Ebook extends Book  implements Downloadable {

    double size;

    public abstract void open();
}
