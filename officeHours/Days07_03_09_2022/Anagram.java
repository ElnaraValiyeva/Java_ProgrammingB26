package Days07_03_09_2022;

public class Anagram {
    public static void main(String[] args) {
        String a ="a gentleman";
        String b = "elegant man";

        a=a.toLowerCase().replace(" ","" );
        b=b.toLowerCase().replace(" ", "");

        if(a.length()==b.length()){
            for(int i=0; i < a.length(); i++){

                char each = a.charAt(i);

                b = b.replaceFirst(each +"" , "");
            }

            if(b.isEmpty()){
                System.out.println("Anagram");
            }else{
                System.out.println("Not Anagram");
            }
        }

    }
}
