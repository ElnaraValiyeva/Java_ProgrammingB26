package day16_review.Dat36_overloading;

public class ArrayIndexOf {

    public static void main(String[] args) {
         int [] arr = {12,5,1,5,2,6,5};
        System.out.println(indexOf(arr, 2));
        System.out.println(indexOf(arr, 20));
        System.out.println(indexOf(arr,5));
    }

    public static int indexOf(int [] nums, int element){

        for(int i =0; i < nums.length;i++){

            if(nums[i] == element){
                return i;
            }
        }

        return -1;

    }


    }

