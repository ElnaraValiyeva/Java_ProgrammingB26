package Day37_wrapper_arraylist;

public class CountCharacters {
    public static void main(String[] args) {

        String s ="aP3d572&*jd@jdJU";
        int upper=0,lower = 0, number = 0, other = 0;
        String uppercase = " ";
        String lowercase = " ";

        for(int i = 0; i < s.length(); i++){

            char letter = s.charAt(i);

            if(Character.isUpperCase(letter)){
                upper++;
                uppercase+=letter;
            }else if(Character.isLowerCase(letter)){
                lower++;
                lowercase+=letter;
            }else if(Character.isDigit(letter)){
                number++;
            }else{
                other++;
            }
        }
        System.out.println("Uppercase " + upper);
        System.out.println("Uppercase: " + uppercase );
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Lowercase: " + lower);
        System.out.println("Numbers: " + number);
        System.out.println("Other " + other);
    }

}
