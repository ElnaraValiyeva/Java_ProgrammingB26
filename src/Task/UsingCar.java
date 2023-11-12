package Task;

public class UsingCar {
    public static void main(String[] args) {

        CarModel car = new CarModel();

        car.model="Toyota";
        car.color="Black";
        car.fuelLevel=78.02;
        car.year= 2019;

        System.out.println(car);
        car.drive(5);
        car.fillTank();
        System.out.println(car);
        car.isSlow();
        System.out.println(car.isSlow());





    }

}
