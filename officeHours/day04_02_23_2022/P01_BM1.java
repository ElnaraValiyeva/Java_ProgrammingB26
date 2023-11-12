package day04_02_23_2022;

public class P01_BM1 {
    public static void main(String[] args) {
        double mass = 82.4;
        double height = 1.82;
        double BMI = mass / height * height;
        String result="";

        if (BMI < 18.5) {
            result="Underweight";
        } else if (BMI >= 18.5 && BMI < 25) {
            result="Normal weight";
        } else if (BMI > 25 && BMI < 30) {
            result="Overweight";
        } else {
            result="Obese";
        }
        System.out.println("Your BMI index refers : " + result);
    }
    }



