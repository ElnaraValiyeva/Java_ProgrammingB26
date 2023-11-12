package Day1;

public class StringRecap {
    public static void main(String[] args) {

        String date ="10/10/2022  14:59:00";
        //create new obj in string pool
        date=date.replace("/", "");
        System.out.println("1-->" + date);

        date=date.replace(" ", "");
        System.out.println("2--> " + date);

        date=date.replace(":", "");
        System.out.println("3--> " + date);

        System.out.println();


    }
    public static String timeStamp(String dateFromUI){
        return dateFromUI= dateFromUI.replace("/","").replace(" ", "").replace(":","");
    }

    public static void timeStampWithVoid(String date){
         date= date.replace("/","").replace(" ", "").replace(":","");


    }
}
