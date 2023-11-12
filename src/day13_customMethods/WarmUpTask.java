package day13_customMethods;

public class WarmUpTask {

    public static void main(String[] args) {

        eligibleToVote(18,true);




    }

    public static void ageGroup(int age){

        if(age >=0 && age <= 150){
            System.out.println(((age <= 21)? "Teenager" :(age < 55)? "Adult" : "Senior" ));

        }else{
            System.out.println("Invalid age: " + age);

        }
        {


        }
    }

    public static void eligibleToVote(int age, boolean isAmerican){

        if(age >= 18 && isAmerican){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You not eligible to vote");
        }
    }

}
