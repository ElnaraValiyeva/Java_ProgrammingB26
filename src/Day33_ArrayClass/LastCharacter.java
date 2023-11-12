package Day33_ArrayClass;

public class LastCharacter {
    public static void main(String[] args) {
        String[][] word = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"},
        };
        for(String [] eachArray: word){

            for(String eachword : eachArray){
                System.out.println(eachword.charAt(eachword.length()-1));
            }
            System.out.println();



        }

    }
}
