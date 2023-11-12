package day12_if_statements;
import java.util.Scanner;


public class Languages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter tne number for language");
        int Number = input.nextInt();

        if (Number == 1) {
            System.out.println("Hello, thank for your call");
        } else if (Number == 2) {
            System.out.println("Hola, gracias para llamar");
        } else if (Number == 3) {
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        } else if (Number == 4) {
            System.out.println("Privet, spasibo za vash zvonok");
        } else if (Number == 5) {
            System.out.println("Merci ,pour votre appel");
        } else {
            System.out.println("We will use English by default");
        }
    }
}
