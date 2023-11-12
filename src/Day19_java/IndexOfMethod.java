package Day19_java;

public class IndexOfMethod {
    public static void main(String[] args) {
        String s = "pen";

        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("n"));
        System.out.println(s.indexOf("pe"));
        System.out.println("pz");


        String d = "java";
        System.out.println(d.indexOf('a'));
        System.out.println(d.lastIndexOf('a'));

        String word = "definition";

        System.out.println("first i: " + word.indexOf('i'));
        System.out.println("last i: " + word.lastIndexOf('i'));

        System.out.println("second i: " + word.indexOf('i',4));
        System.out.println("third i: " + word.indexOf('i',6));
    }
}
