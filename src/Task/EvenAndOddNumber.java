package Task;

import javax.imageio.stream.ImageInputStream;

public class EvenAndOddNumber {

    public static void evenNum(){



        for(int i = 0; i < 100; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
    public static void oddNum(){
        for(int i = 0; i < 100;i++){
            if( i % 2 !=0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        evenNum();
        oddNum();
    }





}
