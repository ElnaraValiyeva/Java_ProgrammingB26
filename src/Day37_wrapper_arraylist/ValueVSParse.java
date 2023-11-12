package Day37_wrapper_arraylist;

public class ValueVSParse {
    public static void main(String[] args) {

        String s = "30";

        int seconds = Integer.parseInt(s);

       Integer i =  Integer.valueOf(s);

       int i2 = Integer.valueOf(s);

       String st2 = String.valueOf(30);
        System.out.println(st2 + 1);

    }
}
