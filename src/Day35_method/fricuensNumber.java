package Day35_method;

public class fricuensNumber {

    public static int frequencyOfCharacter(String str, char letter){

        int count = 0;
        for(int i =0; i< str.length(); i++){
            if(str.charAt(i)==letter){
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacter("AAABBCCDD", 'A'));

    }


    }

