package Day22_LoopWhile;

import java.util.Scanner;

public class ColorPicker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int colorsPicked = 0;
        String uniqueColors = "";

        while(colorsPicked< 3){

            System.out.println("Pick a color");
            String color = input.nextLine();


            if(uniqueColors.contains(color)){
                System.out.println("You already have that color");
            }else {
                colorsPicked++;
                uniqueColors += color + " ";

            }

        }
        System.out.println(uniqueColors);


    }
}
