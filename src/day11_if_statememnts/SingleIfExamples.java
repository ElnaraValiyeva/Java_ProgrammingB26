package day11_if_statememnts;

public class SingleIfExamples {
    public static void main(String[] args) {

        int score = 20;

        if(score !=100){
            System.out.println("It is false");
        }else{
            System.out.println("It is a true");
        }


        int year = 2020;
        boolean lockdown = year == 2020 || year == 2021;

        if(lockdown ){
            System.out.println("Stay at home");
        }else{
            System.out.println("Go to travel");


        }

        boolean  isHungry=true;

        if(isHungry){
            System.out.println("You are hungry");
        }else{
            System.out.println("I will get some food for you");
        }




}
}

