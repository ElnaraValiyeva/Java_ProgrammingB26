package Day_29_Array;

public class ForEachExample {
    public static void main(String[] args) {

        int [] nums = {30,12,159, 12};

        for(int i = 0; i < nums.length; i++){
            System.out.println("traditional " + nums[i]);

        }
        System.out.println();

        for( int element : nums){
            System.out.println("for each " + element);
        }

        String [] classes = { "java", "soft skills", "selenium","database", "api"};

        for(int i = 0; i < classes.length; i++){
            System.out.println(classes[i]);
        }

        System.out.println();

        for( String word : classes){
            System.out.println(" Each: "+ word);
        }
        System.out.println();


        double [] prices = {10,4, 40.2, 410.2};

        for(double each : prices){
            System.out.println("$ " + each);
        }
        System.out.println();







    }

}
