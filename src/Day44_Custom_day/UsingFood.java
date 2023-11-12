package Day44_Custom_day;

public class UsingFood {
    public static void main(String[] args) {

            Food food1 = new Food("Pasta");
            System.out.println(food1);
            System.out.println();
            Food food2 = new Food("Pasta",4 );
            System.out.println(food2);
            System.out.println();
            Food food3 = new Food("Pasta", 4,10.99);
            System.out.println(food3);

        }
}
