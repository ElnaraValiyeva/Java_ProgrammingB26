package Day26_nested_loops;

public class Multiplication {
    public static void main(String[] args) {

  //       for( int i=1;i<=10; i++ ){
  //      System.out.print(1 + " x " + i + " = " + (1*i) + " | ");//     }
  //       for(int i =1; i <=10;i++){
  //          System.out.println(2 + " x " + i + " = " + (2 * i))
  //
 //     }

 // nested loop
        for(int num = 1; num <= 10; num++){

           for(int multi = 1; multi <= 10; multi ++){
               System.out.print(num + " x " + multi + " = " + (num * multi) + " | ");
           }
            System.out.println();

        }

}
}

