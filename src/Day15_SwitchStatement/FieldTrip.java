package Day15_SwitchStatement;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" What is your grade level");

        int grade = 1;
        int numberOfGroups = 0;
        String location = "";
        String teacher = "";
        if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
                location = "Apple orchard";
                numberOfGroups = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numberOfGroups = 7;
                teacher = "Mr.Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numberOfGroups = 5;
                teacher = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Movie theater";
                numberOfGroups = 2;
                teacher = "Ms. Reyes";
            } else if (grade == 5) {

                location = "Museum";
                numberOfGroups = 5;
                teacher = "Ms. Lela";

            } else if(grade == 6){
                location = "Six Flags";
                numberOfGroups = 8;
                teacher = "Mr. Watt";
            }


        System.out.println("Location: " + location);
        System.out.println("Number of Group: " + numberOfGroups);
        System.out.println("Teacher in charge: " + teacher);

    }else{
             System.out.println("Grade must be between 1-6");
    }
    }


























}
