package day13_customMethods;

public class returnMethodIntro {

    public static void main(String[] args) {

       int total = addition(10,20);
        System.out.println(total);

        int t = square(20);
        System.out.println(t);

        int r =cube(5);
        System.out.println(r);







    }

    public static int addition(int n1,int n2){
        int result = n1 + n2;
        return  result;

    }

    public static int square(int num){

        int square = num * num;
        return square;

    }

    public static int cube(int num){
        int cube = square (num) * num;
        return cube;
    }


}
