package Day49_inheritance;

public class UseApp {
    public static void main(String[] args) {
        App app = new App("Twitter","Old");
        System.out.println(app);
        app.download();

        Instagram ella=new Instagram("218.0.0.4");
        System.out.println(ella);
        ella.postPicture();

        YouTube word= new YouTube("Gold");
        System.out.println(word);
        word.watchVideo();




    }
}
