package Day27_NestedLoop;

public class AABCCDEEF {
    public static void main(String[] args) {

        String str = "AABCCDEEF";
        for(int i = 0; i < str.length(); i++){

            char letter = str.charAt(i);
            int count = 0;

            for(int j = 0; j < str.length(); j++){

                char inner = str.charAt(j);

                if(letter == inner){
                    count++;
                }

            }

            if(letter == 1){
                System.out.println();
            }
            System.out.println();

        }
    }

}
