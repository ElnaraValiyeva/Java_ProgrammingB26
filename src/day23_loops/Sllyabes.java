package day23_loops;

import java.util.Locale;
import java.util.Scanner;

public class Sllyabes {
    public static void main(String[] args) {
        String s = "el-na-ra";
        int syllables = 1;
        for (int i =0; i < s.length(); i++){

            if(s.charAt(i)== '-'){
                syllables++;

            }
        }
        System.out.println("Syllables: " + syllables);


    }
}
