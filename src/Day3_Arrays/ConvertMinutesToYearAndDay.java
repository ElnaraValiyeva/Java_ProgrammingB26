package Day3_Arrays;

public class ConvertMinutesToYearAndDay {

    public static void main(String[] args) {
        /**
         * 1 day=24 hour;
         * 1 minute =60 second;
         *  (24*60*60 seconds);
         */

        int givenMin = 34567890;
        int howManyMinInAYear = (24* 365 * 60);
        int year = givenMin / howManyMinInAYear;
        System.out.println("year = " + year);
        System.out.println("---------------");
        int remainderMin = givenMin % howManyMinInAYear;
        System.out.println("remainderMinutes = " + remainderMin);
        System.out.println("---------------");
        int days = remainderMin/ (24 * 60);
        System.out.println("days = " + days);

        System.out.println(givenMin+" minutes is approximately "+year+" years and "+days+" days");



    }


}
