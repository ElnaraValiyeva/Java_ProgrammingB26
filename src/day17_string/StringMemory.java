package day17_string;

import java.util.Locale;

public class StringMemory {
    public static void main(String[] args) {
        String first ="java";//string literal, in String pool
        String second = new String("Java");//String object, not in String, but directlyin the heap
        System.out.println(first == second);
        String third ="java";
        System.out.println(first == third);
        String fourth = "Java";
        System.out.println(first == fourth);
        String forth ="java";
        System.out.println(third==first);

        String str1 =new String("Java");
        String name = "wooden spoon";
        name.toUpperCase();
        System.out.println(name);

        System.out.println("----------next--------");
        String str = "Java";
        String str2 = "Java";
        String str3 = "Java";
        System.out.println(str);

        String str4  = new String ("Java");
        str4 = str4.toUpperCase();
        System.out.println(str4);

        String strr = "Cydeo";
       char ch1 =  strr.charAt(1);
        System.out.println(ch1);

        String strr1 = "Elnara";

        int n1=strr1.length();
        System.out.println(n1);

        int lastIndex =strr1.length() -1;
        System.out.println("lastIndex = " + lastIndex) ;

        String name1 = "james";
        System.out.println(name.equals("James"));
        System.out.println(name.equals("james"));
        System.out.println(name1.length());




        System.out.println(name.equalsIgnoreCase("James"));



        /*
        String last = "today was fun";
        System.out.println(last.length());

        System.out.println(last.equals("today"));
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN"));


         */
        String ella = "I am happy";
        String mama = " She is funny";
        System.out.println(ella.length()-2);
        System.out.println(ella.equalsIgnoreCase("she is funny"));
        System.out.println(ella.equals(" She is funny"));







    }
}
