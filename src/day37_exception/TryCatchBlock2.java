package day37_exception;

public class TryCatchBlock2 {

    public static void main(String[] args) {
        System.out.println("Program1 started");

        int[] arr = {1,2,3,4};
        try{
            System.out.println(arr[1000]);
        }catch(RuntimeException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());


        System.out.println("program1 ended");

    }
}
}
