package day50_inheritance.book;

public class AudioBook extends Book {
    double duration;
    String narrator;
    public  void listen(){
        System.out.println("Listening to " + title + "is funnarrated by " + narrator);

    }
}
