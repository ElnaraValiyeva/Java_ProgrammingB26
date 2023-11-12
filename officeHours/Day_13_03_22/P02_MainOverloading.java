package Day_13_03_22;

public class P02_MainOverloading {
    public static void main(char[] args) {
        System.out.println("Hello from char main");;

    }

    public static void main(String[] args) {
        // Can we overload main method ?
        // Yes we can

        System.out.println("Hello from String main");
        System.out.println();


    }
    public static void main(int[] args) {
        System.out.println("Hello from int main");

    }

    public static void main(double[] args) {
        System.out.println("Hello from double main");

    }
    public static void main(float [] args){
        System.out.println("Hello from float main");

    }


}


