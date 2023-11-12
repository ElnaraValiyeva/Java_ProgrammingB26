package Day34_methods;

public class MethodsWithOthers {

    public static String dayInWords(int day){

        String strDay = "";

        switch (day){
            case 1:
                return "Monday";
            case 2:
                return  "Tuesday";
            case 3:
                return  "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            default:
                return  "Invalid";
        }

    }

    public static int firstEvenNumber(int [] nums){

        for(int num : nums){
            if(num %2 == 0){
                return num;
            }

        }

        return 0;


    }

    public static void main(String[] args) {
        int [] arr = {5,1,4,12,5};
        System.out.println(firstEvenNumber(arr));
    }

}









