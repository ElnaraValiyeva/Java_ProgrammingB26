package Task;

public class practice11 {
    public static void main(String[] args) {

        System.out.println(max(100,30));


        System.out.println(isOdd(40));

        int num = 20;

        if(isEven(num)){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }


    }

    public static boolean isOdd(int num){
        if(num %2 == 0){
            return true;
        }
        return false;
    }

    public static boolean isEven(int num){
        return !isOdd(num);
    }

    public static int max(int n1,int n2){
       // return n1 > n2 ? n1 : n2;

        if(n1 > n2){
            return n1;
        }else{
            return n2;
        }

    }
}
