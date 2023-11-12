package Task;

public class Numbers {

    public static void NegativePozitiveZero(int nums){

        if(nums> 0){
            System.out.println("This is Pozitive number");
        }else if(nums<0){
            System.out.println("This is neqative");
        }else if(nums == 0){
            System.out.println("This is zero");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NegativePozitiveZero(0);
    }
}
