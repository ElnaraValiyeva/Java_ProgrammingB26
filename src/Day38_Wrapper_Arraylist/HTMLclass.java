package Day38_Wrapper_Arraylist;

import java.util.Arrays;

public class HTMLclass {
    public static void main(String[] args) {
        System.out.println(htmlGenerate("li^3"));
        System.out.println(htmlGenerate("di^5"));

    }

    public static String htmlGenerate(String str){

        String html = "";

        String [] parts = str.split("\\^");//str.replace("^" , " " );

         int repeat = Integer.parseInt(parts[1]);

         for(int i = 0; i < repeat; i++){

             html += "<" + parts[0] + "></" + parts[0] + ">";

         }

        return html;

    }

}
