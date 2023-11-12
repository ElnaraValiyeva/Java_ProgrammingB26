package Day18_String;

public class RecapMethod {
    public static void main(String[] args) {
        String s = "pen";

        String s2 = new String( "pen)");
        System.out.println("compare with == " +(s==s2));
        System.out.println("Compare with.equals() " + (s.equals(s2))) ;
        System.out.println("compare with.equal()" + s.equals("Pen"));
        System.out.println(s.equalsIgnoreCase("Pen"));

        boolean isSame = s.equalsIgnoreCase("PEN");

        if(s.equals("pen")){

        }
        int len = s.length();
        System.out.println(len);

        if(s.length()>4){
            System.out.println("long word");
        } else {
            System.out.println(" short word");
        }


    }



}
