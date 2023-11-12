package Day18_String;

public class EmptyorBlank {
    public static void main(String[] args) {

        String str = "last example";
        System.out.println(str.isEmpty());

        String s = " "; //
        System.out.println(" s is empty" + s.isEmpty());

        String mi = "  ";
        System.out.println(mi.isEmpty());

        System.out.println("s is blank " + s.isBlank());
    }
}
