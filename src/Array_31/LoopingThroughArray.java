package Array_31;

public class LoopingThroughArray {

    public static void main(String[] args) {
        String [] array = {"CYDEO", "Java", "Wooden Spoon"};

        for(int i =  array.length-1; i >=0; i--){

            System.out.println(array[i]);
            System.out.println(array[array.length-1]);

            for(String each : array){
                System.out.println(each);


            }




        }



    }


}
