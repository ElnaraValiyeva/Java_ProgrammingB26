package Day41_ArrayList;

public class UsingApp {
    public static void main(String[] args) {

        App cydeo = new App();
        cydeo.name = "Cydeo";
        cydeo.version = 5.5;
        cydeo.isFree = true;

        cydeo.run();
        cydeo.update();

        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);
        System.out.println(cydeo);


        new App().run();

    }
}
