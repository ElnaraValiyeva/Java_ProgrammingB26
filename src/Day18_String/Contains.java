package Day18_String;

public class Contains {
    public static void main(String[] args) {

        String password= "AWS";
       // System.out.println(password.contains("it is"));
       // System.out.println(password.contains("AWS"));


        boolean passStart=password.startsWith("S");
        boolean passEnds = password.endsWith("S");

        if(passStart && passEnds){
            System.out.println(password + " working");
        }else{
            if(!passStart){
                System.out.println(password + " pass need start with A");
            }
            if(!passEnds){
                System.out.println(password + " pass should end with S");
            }
        }


        }

    }

