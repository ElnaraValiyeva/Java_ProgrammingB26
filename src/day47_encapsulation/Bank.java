package day47_encapsulation;

public class Bank {
    public static void main(String[] args) {
        System.out.println(DebitCard.accountType);

        DebitCard obj1 = new DebitCard(123456789L,"James", 1000000);
        System.out.println(obj1);
        System.out.println();

        DebitCard obj2 = new DebitCard(13478954L, "Elnara", 1000002);
        System.out.println(obj2);
        System.out.println(obj2.accountType);

        System.out.println();
        DebitCard obj3 = new DebitCard(34567890000L,"Janna", "Visa", 2000, 20000);
        System.out.println(obj3);





    }
}
