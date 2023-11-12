package day23_loops;

import java.util.Scanner;

public class Shoppinglist {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String list = "Shopping List:\n";
        String addMore;



        do{

            System.out.println("Enter the name of the item");
            list+="\n*" + input.next();

            System.out.println("Do you want to add more to your shopping list?");
            addMore = input.nextLine();

        }while(addMore.equalsIgnoreCase("yes") || addMore.equalsIgnoreCase("y"));

        System.out.println(list);

    }
}
