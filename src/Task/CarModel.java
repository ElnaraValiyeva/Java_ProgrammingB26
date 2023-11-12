package Task;

public class CarModel {
    /*
    - isLow() [boolean]
        create a method that will check if the gas level is low.
            return true is the gas level is below 25
            otherwise return false

Create a separate class to create Car objects and test the methods created
     */

    String model, color;
    int  year,amount;
    double fuelLevel;
    @Override


    public String toString(){
        return  "Car information: " + "\nModel: " + model  + "\nYear: " + year + "\nColor: " + color  + "\nFuelLevel: " + fuelLevel;
    }

    public void drive(int i){
        System.out.println("Driving model");
        fuelLevel -= 5;
    }
    public void fillTank(){
        System.out.println("Filling tank");
        fuelLevel=100;
    }
    public boolean isSlow(){
        if(fuelLevel < 25){
            return true;
        }else{
            return false;
        }


    }


}
