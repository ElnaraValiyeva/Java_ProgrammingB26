package Day_11_03_2022;

public class StringMethod {

    public static void StringStep(String string , int n ){
            String s = "";

            for ( int i = 0; i < n; i++ )
            {
                s = s + string;
            }
        System.out.println(s);
        }

    public static void main(String[] args) {
        StringStep("Hi",2);//HiHi
        StringStep("Hi",3 );//HiHiHi
        StringStep("Hi", 1);//Hi


    }


}


