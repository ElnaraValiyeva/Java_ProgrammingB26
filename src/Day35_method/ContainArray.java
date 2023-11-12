package Day35_method;

public class ContainArray {

    public static boolean contains(int [] nums, int element){

        for(int each : nums){

            if(each == element){
                return true;
            }
        }





        return false;


    }

    public static void main(String[] args) {
        contains(new int[]{23}, 12);
    }
}
