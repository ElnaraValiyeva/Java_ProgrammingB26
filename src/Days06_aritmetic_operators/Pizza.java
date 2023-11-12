package Days06_aritmetic_operators;

public class Pizza {
    public static void main(String[] args) {
        String typeOfPizza = "Regular";
        int slicenumber = 10;
        int eatingpeople = 2;
        int eachperson = slicenumber/ eatingpeople;
        int leftover = slicenumber % eatingpeople;

        System.out.println("We ordered " +  typeOfPizza + " with " + slicenumber + " slices, " + eatingpeople + " people ate " + eachperson + " slices each with " + leftover + " left over");

    }
}
