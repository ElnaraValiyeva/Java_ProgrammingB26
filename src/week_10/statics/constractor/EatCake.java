package week_10.statics.constractor;

public class EatCake {
    public static void main(String[] args) {

        Cake person1 =new Cake();
        person1.eat(1);
        System.out.println(person1.numOfSlices);


        Cake person2 = new Cake();
        person2.eat(3);
        System.out.println(person2.numOfSlices);




    }
}
