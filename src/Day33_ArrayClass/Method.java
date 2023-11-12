package Day33_ArrayClass;

public class Method {

    public static void unlockCar(){
        System.out.println("Unlocking the car");
    }
    public static void openDoor(){
        System.out.println("Opening the door");
    }
    public static void sitIncar(){
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");
    }

    public  static void startCar(){
        System.out.println("Statrting car");
    }
    public static void driveAndGo(){
        System.out.println("Go");
    }
    public static void  Goooo (){
        sitIncar();
        startCar();
    }

    public static void main(String[] args) {
        unlockCar();
        openDoor();
        driveAndGo();


        System.out.println();
    }




}
