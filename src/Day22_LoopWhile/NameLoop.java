package Day22_LoopWhile;

public class NameLoop {
    public static void main(String[] args) {
        String firstName ="john";
        String lastName ="smith";
        String ID = "";

        ID+=firstName.substring(0,1).toLowerCase() + lastName.substring(0,1).toUpperCase()+lastName.substring(1,3).toLowerCase() + firstName.length()*2;
        System.out.println(ID);
    }


}
/*

public class ID {
    public static void main(String[] args) {
       String firstName = "john";
       String lastName = "smith";
       String id = "";
       id+= firstName.substring(0,1).toLowerCase()+lastName.substring(0,1).toUpperCase()+lastName.substring(1,3).toLowerCase()+(firstName.length()*2);
        System.out.println(id);
        jSmi8
    }



 */