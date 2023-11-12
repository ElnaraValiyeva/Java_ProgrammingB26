package Day18_String;

import jdk.swing.interop.SwingInterOpUtils;

public class UpperAndLower {
    public static void main(String[] args) {

        String str = "elnara";
        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());

        System.out.println(str);

        String word = "HELLO";
        word = word.toLowerCase();
        System.out.println(word);

        int a = 4;
        a++;
        System.out.println(a);

        String word2 = word + "WORLD";
        System.out.println(word2);
        System.out.println(word);

        word += "new text";//word=word+ "new text";

        String old = "mark";
        String newValue = old.toUpperCase();
        System.out.println(newValue);


        String maya="Miss";

        String newValue1 = maya.toLowerCase();
        int len = (newValue.length() -3);
        System.out.println(len);


    }
}
