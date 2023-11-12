package day07;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 0;


        System.out.println(x); //0
        x= x + 1;// take of x, which is o then i add 1 ->0+1=1--x=1

        System.out.println(x);

        x++;// post increment
        System.out.println(x+1); //2

        ++x; //pre increment
        System.out.println(x);//3

        System.out.println(++x); //because it is preincrement it will add 1 right away so 4 is printed
        System.out.println(x++);




    }
}
