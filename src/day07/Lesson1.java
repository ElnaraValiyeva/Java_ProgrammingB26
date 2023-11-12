package day07;

public class Lesson1 {
    public static void main(String[] args) {

        int c = 14;
        System.out.println(c);
        c--;
        System.out.println(c--);
        c++;
        System.out.println(c++);
        --c;
        c--;
        c++;
        System.out.println(--c);
        System.out.println(c--);
        System.out.println(c++);

        int a = 40;
        System.out.println(--a);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(--a);
        System.out.println(a--);

        int b = 20;
        System.out.println(--b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(--b);
        System.out.println(--b);

        System.out.println();

        int d = 10; // 10
        int J = d + 1;
        System.out.println(J); // 11
        System.out.println(d++);// post preincrement it will 10
        System.out.println(d--);//  decrements 11
        System.out.println(d);//   10
        System.out.println(d++);//  10
        System.out.println(d++);//  post preincrement  11



        int h = 15;
        int t = h++;
        System.out.println(t);
        h++;
        System.out.println();
        System.out.println(h++);
        h++;
        System.out.println(h++);





    }
}
