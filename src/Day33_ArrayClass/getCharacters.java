package Day33_ArrayClass;

public class getCharacters {
    public static void main(String[] args) {
        printAtoZUpper();
        printZtoAUpper();
        printatozlower();
        printztoalower();
        print0to9();

    }

    public static void printAtoZUpper(){
        for(char i ='A'; i <='Z';i++){
            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void printZtoAUpper(){
        for(char i ='Z'; i >='A';i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printatozlower(){
        for(char i = 'a'; i<='z';i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printztoalower(){
        for(char i = 'z'; i>='a';i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void print0to9(){
        for(int i =0;i<=9;i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
