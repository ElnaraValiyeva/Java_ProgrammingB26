package Day35_method;

import MyLibrary.StringUtil;

public class UniqueCharacters {

    public static String  uniqueCharacters(String str){

        String unique = "";
        String checked = "";

        for( int i = 0; i < str.length();i++){

            int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));


            if(count == 1){
                unique +=str.charAt(i);
            }

        }
         return unique;
    }




    public static void main(String[] args) {
        System.out.println(uniqueCharacters("Banana"));
    }}

