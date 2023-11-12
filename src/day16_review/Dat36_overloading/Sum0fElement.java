package day16_review.Dat36_overloading;

public class Sum0fElement {
    public static void main(String[] args) {
        int [] arr = {10,30,40,50};
        System.out.println(sum(arr));

        System.out.println(sum(1,4,6,9));

    }

    public static int sum(int ...nums){
        int sum =0;
        for(int each: nums){
            sum+=each;
        }
        return sum;
    }





}
