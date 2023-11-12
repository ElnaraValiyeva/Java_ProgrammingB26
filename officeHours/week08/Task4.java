package week08;

public class Task4 {
    public static void secondLast(String str){
        String result = "";
        String[] words = str.split(" ");
        if(str.length() >= 2){
            result = words[words.length - 2];
        }

        System.out.println("result = " + result);

    }

    public static void main(String[] args) {
        secondLast("I love Cydeo");


    }

    public static void nthLast(String str, int index){
        String result ="Please enter more than one word" + index + " words";
        String[] words = str.split(" ");
        if(words.length >=index){
            result = words[words.length - index];
        }
        System.out.println("result = " + result);

    }

}


