package Day14_if_statements;

public class Nested12 {
    public static void main(String[] args) {
         boolean a = false;
         boolean b =true;
         boolean c = true;

         if(a) {

             System.out.println(1);
             if(b){
                 System.out.println(3);
             }
             if (c){
                 System.out.println(3);
             } else {
                 System.out.println(4);
             }
         }else {
             System.out.println("z");
         }
    }
}
