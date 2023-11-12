package week08;

public class Task3 {

    public static String reverseString(String sentence){
        String result = "";

        String[] words = sentence.split(" ");
        //word =["cydeo", "is", "big"]
        for (int i = words.length-1; i >=0; i--) {
            result+=words[i] + " ";

        }

        System.out.println(result.substring(0,1).toUpperCase() + result.substring(1));
        return result.trim();

    }

    public static void main(String[] args) {

        reverseString("Cydeo is big");

    }

}


