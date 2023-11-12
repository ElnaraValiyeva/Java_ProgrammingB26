package Day26_nested_loops;

public class PrimeNumber {

    public static void main(String[] args) {
         for( int l =1; l<=4; l++){
             boolean primeNUmber = true;

             if (l>1) {

                 for(int j = 2; j<l; j++){

                     if(l%j==0){
                         primeNUmber=false;
                     }
                 }
             }else{
                 primeNUmber=false;
             }
             if(primeNUmber){
                 System.out.print( l +" ");
             }
         }
    }
}
