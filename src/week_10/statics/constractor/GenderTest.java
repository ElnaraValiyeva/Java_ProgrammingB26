package week_10.statics.constractor;

public class GenderTest {

    public static void main(String[] args) {

        Gender gender = new Gender();

        gender.female ="Ella";
        gender.age = 20;

        Gender gender1 = new Gender("OOP");
        gender1.age =45;

        Gender gender3=new Gender("Mama",10);


    }
}
