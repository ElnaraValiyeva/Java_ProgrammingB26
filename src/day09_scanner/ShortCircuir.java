package day09_scanner;

public class ShortCircuir {
    public static void main(String[] args) {
        // 5/0
        System.out.println(true || 5/0 == 0);

        System.out.println(false && 5/0 ==0);
        System.out.println(false && 5/0 == 0);



        boolean friday = true;
        boolean youTheacher =true;
        boolean youPolice = false;
        boolean whoisget = youTheacher || youPolice;
        boolean getDiscount = friday && whoisget;

        System.out.println("You can get a discount In Friday if you a theacher, or police officer " + getDiscount);

        boolean allWeek = true;
        boolean Thuesday= true;
        boolean Sunday = false;
        boolean rainDay = Thuesday|| Sunday;
        boolean allweek = allWeek && rainDay;

        System.out.println("This week In New York will be mainly day " + allweek );






    }
}
