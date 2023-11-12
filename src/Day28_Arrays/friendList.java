package Day28_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class friendList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many friends: ");
        int numOfFriends = scan.nextInt();
        String Names[] = new String[numOfFriends];

        for (int i = 0; i < Names.length; i++) {
            System.out.print("Enter the name of friend " + ( i +1 ) +  " : ");
            Names[i] = scan.next();
        }
        System.out.println(Arrays.toString(Names));









        }







    }

