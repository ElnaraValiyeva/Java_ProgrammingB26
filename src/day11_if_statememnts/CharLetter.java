package day11_if_statememnts;

public class CharLetter {

    public static void main(String[] args) {
        char letter = 'b';

        if( letter<65 && letter>85 ){
            System.out.println("The letter is a lowercase");
        }else if(letter>90 && letter<100){
            System.out.println("The letter is a uppercase");
        }
    }
}
