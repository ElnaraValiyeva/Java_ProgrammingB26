package Task;

public class TrinagleCircleNum {

    public static void TriCircle(int num1,int num2, int num3){

        if(num1 + num2 + num3==180){
            System.out.println("This is trinagle");
        }else if(num1+num2+num3 == 360){
            System.out.println("This is a circle");
        }else {
            System.out.println("Other shape");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        TriCircle(90,80,10);
    }

}
