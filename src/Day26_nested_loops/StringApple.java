package Day26_nested_loops;

public class StringApple {
    public static void main(String[] args) {

        String s="applee";
        String checked = "";
        int count = 0;
        for(int i=0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(checked.contains(("" + letter))){
                continue;
            }

            for(int j = 0; j < s.length(); j++){
                char eachLetter = s.charAt(j);

                if(letter == eachLetter){
                    count++;

                }
            }
            System.out.println(letter + " - " + count);
            checked+=letter;
        }

    }

}
