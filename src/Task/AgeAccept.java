package Task;

public class AgeAccept {

    public static void ageVote(int age){
        if (age>=18){
            System.out.println("You are eligible");
        }else if(age<18){
            System.out.println("You are not eligible");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int age = 20;
        ageVote(age);
    }



}
