package Task;

public class Character {
    public static void sentence(String str){
        for(int i =0; i< str.length();i++){
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sentence("Elnara");
    }


}
