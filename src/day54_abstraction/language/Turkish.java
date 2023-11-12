package day54_abstraction.language;

public class Turkish  implements Language{
    @Override
    public void hi() {
        System.out.println("Selam");

    }

    @Override
    public void bye() {
        System.out.println("Ne haber");

    }
}
