package day_Date;

public class single_If {
    public static void main(String[] args) {

        int temp = 75;
        String result="";

        if(temp>=70 && temp<=80){
            result = "Ideal Temp";
        }
        System.out.println(result);

        int a=8;
        int b=50;
        int c=150;

        if(b == 50 && c>100){
            a = 20;
        }
        System.out.println(a);

    }

}
