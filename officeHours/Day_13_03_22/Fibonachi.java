package Day_13_03_22;

import java.util.Arrays;

public class Fibonachi {
    public static void main(String[] args) {
        fib(8);

    }
    public static void fib(int num){

    int [] fib = new int [num + 1];
    //0, 1, 1, 2,3,4,5,6,7,8...
    fib[0] = 0;
    fib [1] = 1;

        for( int i = 2; i < fib.length; i++){
        fib[i] = fib [i -1] + fib[i-2];


    }
        System.out.println(Arrays.toString(fib));


    }

}
