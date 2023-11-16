package interviewPracticeBatch31;

public class removeDublicate {

    public static String removeDub(String str){

        String unique="";

        for(int i = 0; i <str.length();i++){
            if(!unique.contains(str.charAt(i) + "")){
                unique+=str.charAt(i);
            }

        }
        return unique;
    }

    public static void main(String[] args) {
        removeDub("abcc");
        System.out.println(removeDub("abcc"));
    }

}
