package Day37_wrapper_arraylist;

public class GoogleSearch {
    public static void main(String[] args) {
         String result = "About 2,500,000,000 results (1.00 seconds)";
         String [] arr = result.split(" ");

         String resultStr = arr[1].replace(",", "");
         String timeStr = arr[3].substring(1);

        System.out.println(resultStr);
        System.out.println(timeStr);

        long resultNUmber = Long.parseLong(resultStr);
        double timeNumber = Double.parseDouble(timeStr);

        if(resultNUmber >= 0){
            System.out.println("Pozitive number");
        }

        if(timeNumber <= 2 && timeNumber >= 0){
            System.out.println("Under 2 seconds");
        }


    }
}
