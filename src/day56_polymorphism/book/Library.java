package day56_polymorphism.book;

public class Library {
    public static void main(String[] args) {

        JavaTextbook book1 =  new JavaTextbook();
        book1.name = "Java Programming";
        book1.size=20.5;
        book1.fun = true;
        book1.open();
        book1.read();
        book1.download();

        Ebook book2 =  new JavaTextbook();
        book2.name = "Java Programming";
        book2.size=20.5;
        ((JavaTextbook)book2).fun = true;
        book2.open();
        book2.read();
        book2.download();

        Book  book3 = new JavaTextbook();
        book3.name= "java Programming";
        book3.read();

       Downloadable book4 = new JavaTextbook();
       book4.download();



    }
}
