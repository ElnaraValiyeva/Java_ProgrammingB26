package day17_string;

public class StringMethods {
    public static void main(String[] args) {

        String name ="james";
        System.out.println(name.equals("james"));
        System.out.println("____");
        System.out.println(name.equalsIgnoreCase("James"));
        System.out.println(name.length());

        String str = "last example";
        System.out.println(str.isEmpty());

        str ="";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        System.out.println(str.equals("hi"));

        String e = " ";
        System.out.println("e is empty:" + e.isEmpty());

        String s2 = "      ";
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());


        String word = "Elnara learn Java";
        System.out.println(word.contains("Elnara"));
        System.out.println(word.contains("learnjava"));
        System.out.println(word.contains("Learn"));







    }
}
